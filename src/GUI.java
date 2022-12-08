import java.awt.BorderLayout;

import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;

import java.awt.event.ActionEvent;
import java.awt.event.*;  
import javax.swing.*;
import javax.swing.LayoutStyle.ComponentPlacement;   



public class GUI{
	private static JFrame AddWordFrame;
	private static JFrame pruefungFrame;
	

	private static Vokabeltest voc;


	private void initializeAddFrame(){
		JPanel panel;
		JLabel germanLabel;
		JTextField germanWordInput;
		JLabel englishLabel;
		JTextField englishWordInput;
		JButton enterButton;
		JLabel warningText;
		JButton switchPanelButton;

		AddWordFrame = new JFrame();
		panel = new JPanel();
	
		warningText = new JLabel();
		warningText.setBounds(200, 75, 2000, 25);
		panel.add(warningText);
		warningText.setVisible(false);
		
		germanLabel = new JLabel("Enter German word");
		germanLabel.setBounds(10, 20, 250, 25);
		panel.add(germanLabel);
	
		germanWordInput = new JTextField(30);
		germanWordInput.setBounds(175, 20, 250, 25);
		panel.add(germanWordInput);
		
		englishLabel = new JLabel("Enter Translation");
		englishLabel.setBounds(10, 50, 250, 25);
		panel.add(englishLabel);
		
		englishWordInput = new JTextField(30);
		englishWordInput.setBounds(175, 50, 250, 25);
		panel.add(englishWordInput);

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
			panel.add(enterButton);
			
			
			switchPanelButton = new JButton("Starte Prüfung");
			switchPanelButton.setBounds(60, 110, 120, 25);
			switchPanelButton.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){
					
					
		
					}  
					}
				);
			panel.add(switchPanelButton);
		
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
		
		AddWordFrame.setPreferredSize(new DimensionUIResource(1000, 1000));
		AddWordFrame.add(panel, BorderLayout.CENTER);
		AddWordFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AddWordFrame.setTitle("bruh");
		AddWordFrame.pack();
		AddWordFrame.setVisible(false);
	}


	private void initializePruefungFrame(){
		JPanel panel;
		JTextField uebersetzungWordInput;
		JButton enterButton;
		JButton endPruefungButton;
		JLabel vokabelLabel;
		
		panel = new JPanel();
		uebersetzungWordInput = new JTextField();
		enterButton = new JButton();
		vokabelLabel = new JLabel();


	}


	public GUI(){
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e){
			e.printStackTrace();
		}
		voc = new Vokabeltest();
		initializeAddFrame();
		AddWordFrame.setVisible(true);
		
	}

	
}
