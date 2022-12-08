import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;

import java.awt.event.ActionEvent;
import java.awt.event.*;  
import javax.swing.*;
import javax.swing.LayoutStyle.ComponentPlacement; 


 /* 
public class addFrame extends JPanel {


	JFrame AddWordFrame;


	public addFrame(){
		JLabel germanLabel;
		JTextField germanWordInput;
		JLabel englishLabel;
		JTextField englishWordInput;
		JButton enterButton;
		JLabel warningText;
		JButton switchPanelButton;

		AddWordFrame = new JFrame();
		this = new JPanel();
	
		warningText = new JLabel();
		warningText.setBounds(200, 75, 2000, 25);
		this.add(warningText);
		warningText.setVisible(false);
		
		germanLabel = new JLabel("Enter German word");
		germanLabel.setBounds(10, 20, 250, 25);
		this.add(germanLabel);
	
		germanWordInput = new JTextField
		(30);
		germanWordInput.setBounds(175, 20, 250, 25);
		this.add(germanWordInput);
		
		englishLabel = new JLabel("Enter Translation");
		englishLabel.setBounds(10, 50, 250, 25);
		this.add(englishLabel);
		
		englishWordInput = new JTextField(30);
		englishWordInput.setBounds(175, 50, 250, 25);
		this.add(englishWordInput);

		enterButton = new JButton("Enter Word");
		enterButton.setBounds(10, 85, 120, 25);
		enterButton.addActionListener(new ActionListener(){  
			String germanWord;
			String translatedWord;  
			public void actionPerformed(ActionEvent e){
				
				germanWord = germanWordInput.getText();
				translatedWord = englishWordInput.getText();
				System.out.println(translatedWord);
				System.out.println(germanWord);
	
				if (translatedWord.isBlank() || germanWord.isBlank()){
					System.out.println("YEWEEE");
					warningText.setText("Wort muss vollständig mit Übersetzung eingegeben werden");
					warningText.setForeground(new ColorUIResource(255, 0, 0));
					warningText.setVisible(true);
				}
				else{
					warningText.setVisible(false);
					voc.addVoc(germanWord, translatedWord);
				}
	
				}  
				}
			);
			this.add(enterButton);
			
			
			switchPanelButton = new JButton("Starte Prüfung");
			switchPanelButton.setBounds(60, 110, 120, 25);
			switchPanelButton.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){
					
					
		
					}  
					}
				);
			this.add(switchPanelButton, );
		
		this.setLayout(null);
		this.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
		
	}
	AddWordFrame.setPreferredSize(new DimensionUIResource(1000, 1000));
	AddWordFrame.add(this, BorderLayout.CENTER);
	AddWordFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	AddWordFrame.setTitle("bruh");
	AddWordFrame.pack();
	AddWordFrame.setVisible(false);
}
*/