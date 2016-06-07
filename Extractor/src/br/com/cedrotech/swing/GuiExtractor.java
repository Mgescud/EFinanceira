package br.com.cedrotech.swing;

import java.awt.Choice;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

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
		FormatFile fFile = FormatFile.getInstance(geration);
		TypeFile typeFile = TypeFile.getInstance(layoutTypes);
		this.btnOk.setEnabled(false);
		try {
			if (fFile.equals(FormatFile.MENSAL) || fFile.equals(FormatFile.DIARIO)) {
				Integer ano = Integer.valueOf(this.anoText.getText());				
				if (typeFile.equals(TypeFile.TODOS)) {
					for (TypeFile e : TypeFile.values()) {
						createFile.create("teste/", ano, fFile, cdCliente, e);
					}
				} else {
					createFile.create("teste/", ano, fFile, cdCliente, typeFile);
				}
			} else if (fFile.equals(FormatFile.PERIODO)) {
				Date dateStart = simpleDateFormat.parse(dateInicioText);
				Date dateEnd = simpleDateFormat.parse(dateFimText);
				
				createFile.create("teste/", dateStart, dateEnd, cdCliente, typeFile);
			}
		
		}
		catch (ParseException e) {
			logger.error("Data Inválida, falha na conversão : " + e.getMessage());
		}
		catch (NumberFormatException e) {
			logger.error("Falha na conversão do ano para inteiro : " +e.getMessage() );
		}
		catch (IOException | SQLException e) {
			logger.error("erro de Conexão : "  + e.getMessage());
		} 
		this.btnOk.setEnabled(true);
	}
	
	
	private void buildLayout () throws ParseException {
		
		this.setTitle("Extractor " + ExtractVersion.build);
		this.setSize(250,250);
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
        TextField codClienteText = new TextField(10);       
        c.add(codClienteText, cons);
        
        cons.gridy = 5;        
        btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GuiExtractor.this.invokeCreate();
			}
		});
                
        c.add(btnOk, cons);
                       
        this.setVisible(true);        
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
				this.setSize(300, 250);
				
				this.anoLabel.setVisible(true);
				this.anoText.setVisible(true);
			break;
			
			case PERIODO:
				this.dateInicioLabel.setVisible(true);
				this.dateFimLabel.setVisible(true);
				this.dateInicioText.setVisible(true);
				this.dateFimText.setVisible(true);
				this.setSize(350, 260);
				
				this.anoLabel.setVisible(false);
				this.anoText.setVisible(false);
			break;	
		}	
	
	}
	
}
