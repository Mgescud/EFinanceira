package br.com.cedrotech.swing;

import java.awt.Choice;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.NoSuchFileException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.MaskFormatter;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import br.com.cedrotech.extract.CreateFile;
import br.com.cedrotech.extract.ExtractVersion;
import br.com.cedrotech.extract.FormatFile;
import br.com.cedrotech.extract.TypeFile;

public class GuiExtractor extends JFrame implements ItemListener {
	
	
	private JLabel dateInicioLabel = new JLabel("Inicio:"); 
	private JLabel dateFimLabel = new JLabel("Fim:"); 	
	private JFormattedTextField dateInicioText;
	private JFormattedTextField dateFimText;
	private TextField codClienteText = new TextField(10);
	private CreateFile createFile = new CreateFile();
	
	private JLabel gerationLabel = new JLabel("Geração:");	
	private Choice geration = new Choice();	
	private Choice layoutTypes = new Choice();
	
	private JLabel anoLabel = new JLabel("Ano:");
	private TextField anoText = new TextField(8);
	private JButton btnOk = new JButton("OK");
	private JTextArea areaLog = new JTextArea(50, 10);	
	private JFileChooser fileChooser = new JFileChooser();
	private TextField destPathText = new TextField(10);
	
    private PrintStream standardOut;
    private PrintStream standardErr;
	
	private static final long serialVersionUID = 1L;
	
	final static Logger logger = Logger.getLogger(GuiExtractor.class);
	
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) throws ParseException {
		GuiExtractor gui = new GuiExtractor();
		gui.buildLayout();
	}
	
	private void invokeCreate () {		
		String geration = this.geration.getSelectedItem();
		String layoutTypes = this.layoutTypes.getSelectedItem();
		String cdCliente = this.codClienteText.getText();
		String dateInicioText = this.dateInicioText.getText();
		String dateFimText = this.dateFimText.getText();
		String destFileText = this.destPathText.getText();
		FormatFile fFile = FormatFile.getInstance(geration);
		TypeFile typeFile = TypeFile.getInstance(layoutTypes);
		this.btnOk.setEnabled(false);
		try {
			
			if (StringUtils.isBlank(destFileText))
				throw new NoSuchFileException("destino");
			
			destFileText += File.separatorChar;
			
			// se opção escolhida for Mensal ou Diario
			if (fFile.equals(FormatFile.MENSAL) || fFile.equals(FormatFile.DIARIO)) {
				Integer ano = Integer.valueOf(this.anoText.getText());
				if (typeFile.equals(TypeFile.TODOS)) {
					for (TypeFile e : TypeFile.values()) {
						if (!e.equals(TypeFile.TODOS))  {
							updateProgress("Gerando arquivos de Layout " + e.getLabel());
							createFile.create(destFileText, ano, fFile, cdCliente, e);				
						}
					}
				} else {
					//standardOut.println("Gerando arquivos de Layout " + typeFile.getLabel());
					createFile.create(destFileText, ano, fFile, cdCliente, typeFile);
				}
			} else if (fFile.equals(FormatFile.PERIODO)) {
				//se for por periodo pega a data parametrizada
				Date dateStart = simpleDateFormat.parse(dateInicioText);
				Date dateEnd = simpleDateFormat.parse(dateFimText);
								
				if (typeFile.equals(TypeFile.TODOS)) {
					for (TypeFile e : TypeFile.values()) {						
						if (!e.equals(TypeFile.TODOS)) {
							updateProgress("Gerando arquivos de Layout ");
							createFile.create(destFileText, dateStart, dateEnd, cdCliente, e);	
						}
					}
				} else {
					updateProgress("Gerando arquivos de Layout ");
					createFile.create(destFileText, dateStart, dateEnd, cdCliente, typeFile);
				}
			}
		}
		catch (ParseException e) {
			logger.error("Data Invalida, falha na conversao : " + e.getMessage());
			updateProgress("Data Invalida " + e.getMessage());
		}
		catch (NumberFormatException e) {
			logger.error("Falha na conversao do ano para inteiro : " + e.getMessage() );
			updateProgress("Ano Invalido");
		}		
		catch (NoSuchFileException e) {
			logger.error("Nenhum diretorio selecionado");
			updateProgress("Nenhum diretório selecionado");
		}
		catch (IOException | SQLException e) {
			logger.error("erro de Conexão : "  + e.getMessage());
			updateProgress("erro de Conexao com o banco de dados. ");
		} 		
		
		this.btnOk.setEnabled(true);
	}
	
	
	private void buildLayout () throws ParseException {
		
		this.setTitle("Extractor " + ExtractVersion.build);
		this.setSize(450,320);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = this.getContentPane();       
        GridBagLayout layout = new GridBagLayout(); 
        c.setLayout(layout);  
        
        //label de layout
        GridBagConstraints cons = new GridBagConstraints();         
        cons.anchor = GridBagConstraints.NORTHWEST;        
        cons.gridy = 1;
        cons.insets = new Insets(10,10,5,5);         
        JLabel layoutLabel = new JLabel("Layout:");        
        c.add(layoutLabel, cons); 
        
        //tipos de layouts       
        Choice layoutTypes = new Choice();
        layoutTypes.add("Todos");
        layoutTypes.add("M3");
        layoutTypes.add("M10");
        layoutTypes.add("C3");            
        c.add(layoutTypes, cons);
        
        //tipo da geração dos layouts (Anual, diario, periodo)
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.gridy = 2;
        cons.insets = new Insets(10,10,5,5);         
       
        c.add(this.gerationLabel, cons);      
               
        this.geration.add(FormatFile.MENSAL.getLabel());
        this.geration.add(FormatFile.DIARIO.getLabel());
        this.geration.add(FormatFile.PERIODO.getLabel());  
        this.geration.addItemListener(this);
        c.add(geration, cons);
        
        //ano 
        cons.gridy = 3;
        cons.insets = new Insets(10,10,5,5); 
        c.add(anoLabel, cons);
        c.add(anoText, cons);
        
        //data Inicio Ano
        this.dateInicioLabel.setVisible(false);
        c.add(this.dateInicioLabel, cons);
        
        dateInicioText = new JFormattedTextField(new MaskFormatter("##/##/####"));   
        dateInicioText.setVisible(false); 
       // dateTextField.setPreferredSize(new Dimension(100, 30));
        dateInicioText.setColumns(6);
        c.add(dateInicioText, cons);
        
        //data Fim ano
        this.dateFimLabel.setVisible(false);
        c.add(this.dateFimLabel, cons);
        dateFimText = new JFormattedTextField(new MaskFormatter("##/##/####"));
        dateFimText.setVisible(false);
        dateFimText.setColumns(6);
        c.add(dateFimText, cons);
        
        //codigo cliente
        cons.gridy = 4;
        JLabel codClienteLabel = new JLabel("Cod.Cliente:");  
        c.add(codClienteLabel, cons);        
        c.add(this.codClienteText, cons);
        
        
        //destino arquivos     
        cons.gridy = 5;
        JLabel destFile = new JLabel("Destino:");   
        final JButton buttonFile = new JButton("Selecionar...");
       // buttonFile.setBounds(10,10,10,100);
        buttonFile.setPreferredSize(new Dimension(120, 20));        
        buttonFile.addActionListener(new OpenL());
        destPathText.setEditable(false);        
        this.add(destFile, cons);
        this.add(destPathText, cons);
        this.add(buttonFile, cons);
        
        //btn ok
        cons.gridy = 6;        
        btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GuiExtractor.this.invokeCreate();
				DoItJobThread t = new DoItJobThread();
			    t.start();
			}
		});                
        c.add(btnOk, cons);
        
        cons = new GridBagConstraints();
        cons.gridy = 7;
        cons.gridwidth = 6;

        this.add(configureTextArea(), cons);
        this.setVisible(true);        
	}
	
	
	private JScrollPane configureTextArea () {		  
		areaLog.setEditable(false);
        areaLog.setPreferredSize(new Dimension(340, 60));        
        JScrollPane scroll = new JScrollPane(areaLog, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setPreferredSize(new Dimension(340, 60));
        return scroll;
	}
	
	public void updateProgress(final String msg) {
	    //invokeLater()
	    //This method allows us to post a "job" to Swing, which it will then run
	    // on the event dispatch thread at its next convenience.

	    SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	            // Here, we can safely update the GUI
	            // because we'll be called from the
	            // event dispatch thread
	       /*     outputTextArea.append(msg);
	            outputTextArea.setCaretPosition(outputTextArea.getDocument().getLength());*/
	            //labelStatus.setText(msg);
	        	if (StringUtils.isNotBlank(msg)) {
		        	areaLog.append(msg);
		        	areaLog.append("\n");
	        	}
	        }
	    });

	}
	
	class DoItJobThread extends Thread {
	    @Override
	    public void run() {
	       //do some task 
	       // output the progress
	       updateProgress("");    
	    }
	}
	
	
	class OpenL implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	      JFileChooser c = new JFileChooser();
	      c.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	      int rVal = c.showOpenDialog(GuiExtractor.this);	    
	      if (rVal == JFileChooser.APPROVE_OPTION) { 
	        destPathText.setText(c.getSelectedFile().getPath());
	      }
	      if (rVal == JFileChooser.CANCEL_OPTION) {
	    	 destPathText.setText("");
	      }
	    }
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String itemSelected = (String) e.getItem();
		FormatFile fFile = FormatFile.getInstance(itemSelected);
		
		switch (fFile) {
						
			case MENSAL:
				this.dateInicioLabel.setVisible(false);
				this.dateFimLabel.setVisible(false);
				this.dateInicioText.setVisible(false);
				this.dateFimText.setVisible(false);
				//this.setSize(300, 250);
				
				this.anoLabel.setVisible(true);
				this.anoText.setVisible(true);
			break;
			
			case PERIODO:
				this.dateInicioLabel.setVisible(true);
				this.dateFimLabel.setVisible(true);
				this.dateInicioText.setVisible(true);
				this.dateFimText.setVisible(true);
				//this.setSize(350, 260);
				
				this.anoLabel.setVisible(false);
				this.anoText.setVisible(false);
			break;	
		}	
	
	}
	
}
