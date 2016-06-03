package br.com.cedrotech.swing;

import java.awt.Choice;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TesteSwing extends JFrame  {	
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {	   
		TesteSwing teste = new TesteSwing();
		teste.exemplo1();
	}
	
	
	public void exemplo1(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);  
          
        Container c = this.getContentPane();  
     
        GridBagLayout layout = new GridBagLayout(); 
        c.setLayout(layout);  
        
        
        GridBagConstraints cons = new GridBagConstraints();        
        
        cons.anchor = GridBagConstraints.NORTHWEST;        
        cons.weightx = 0;
        cons.gridy = 1;
        cons.insets = new Insets(10,10,5,5); 
        
        JLabel layoutLabel = new JLabel("Layout:");        
        c.add(layoutLabel, cons);        
        
        Choice layoutTypes = new Choice();
        layoutTypes.add("M3");
        layoutTypes.add("M10");
        layoutTypes.add("C3");
        
        cons = new GridBagConstraints();        
        
        cons.anchor = GridBagConstraints.NORTHWEST;        
        cons.weightx = 0;
        cons.gridy = 1;
        cons.insets = new Insets(10,10,5,5);
        
        c.add(layoutTypes, cons);
        
        cons = new GridBagConstraints(); 
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.gridy = 3;
        cons.weightx = 0;
        cons.weighty = 1;
        cons.insets = new Insets(10,10,5,5);  
        
        JLabel dataInicioLabel = new JLabel("Inicio:");       
        c.add(dataInicioLabel, cons);
        
        cons = new GridBagConstraints();
        cons.anchor = GridBagConstraints.NORTHWEST;   
        cons.gridy = 3;
        cons.weightx = 0;        
        cons.insets = new Insets(5,10,5,5);  
        
        TextField dataInicioText = new TextField(10);
        
        c.add(dataInicioText, cons);
        
        JLabel dataFimLabel = new JLabel("Fim:");
        
        cons = new GridBagConstraints();
        cons.anchor = GridBagConstraints.NORTHWEST;  
        cons.gridy = 3;
        cons.weightx = 0;
        cons.weighty = 0;
        cons.insets = new Insets(10,10,5,5);  
        
        c.add(dataFimLabel, cons);
        
        cons = new GridBagConstraints();
        cons.anchor = GridBagConstraints.NORTHWEST; 
        cons.gridy = 3;
        cons.weightx = 0;
        cons.weighty = 0;
        cons.insets = new Insets(5,10,5,5);  
        
        TextField dataFimText = new TextField(10);
        c.add(dataFimText, cons);
        
        JLabel codClienteLabel = new JLabel("Cod.Cliente:");        
        cons = new GridBagConstraints();
        cons.anchor = GridBagConstraints.NORTHWEST; 
        cons.gridy = 4;
        cons.weightx = 0;
        cons.insets = new Insets(10,10,5,5);        
        
        c.add(codClienteLabel, cons);
        
        TextField codClienteText = new TextField(10);
        cons = new GridBagConstraints();
        cons.anchor = GridBagConstraints.NORTHWEST; 
        cons.gridy = 4;   
        cons.weightx = 0;
        
        cons.insets = new Insets(5,10,5,5);   
        
        c.add(codClienteText, cons);
        
      /*  Label dataInicioLabel2 = new Label("Inicio2:");
        cons.gridx = 0;
        cons.gridy = 1;*/
        
        //c.add(dataInicioLabel2, cons);
              
        this.setSize(350,200);         
        this.setVisible(true);
        this.setResizable(false);
	}

}
