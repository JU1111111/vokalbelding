import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;

import java.awt.event.ActionEvent;
import java.awt.event.*;  
import javax.swing.*;



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
				germanWordInput.setText("");
				englishWordInput.setText("");
	
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
					
					changeFrame();
		
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
		JPanel lePanel;
		JLabel englishLabel;
		JTextField englishWordInput;
		JButton enterButton;
		JLabel vocabelText;
		JButton switchPanelButton;
		JLabel richtigHaken;

		pruefungFrame = new JFrame();
		lePanel = new JPanel();
	
		vocabelText = new JLabel("");
		vocabelText.setFont(new Font("comicsans", Font.PLAIN, 20));
		vocabelText.setBounds(250, 10, 250, 50);
		vocabelText.setVisible(false);
		VokabelWort naechsteVokabel = voc.getNextVoc();
		System.out.println(naechsteVokabel.word);
		vocabelText.setText(naechsteVokabel.word);
		lePanel.add(vocabelText);
	
		vocabelText.setVisible(true);

		englishLabel = new JLabel("Enter Translation");
		englishLabel.setBounds(10, 50, 250, 25);
		lePanel.add(englishLabel);
		
		englishWordInput = new JTextField(30);
		englishWordInput.setBounds(175, 50, 250, 25);
		lePanel.add(englishWordInput);

		richtigHaken = new JLabel();
		ImageIcon haken = new ImageIcon("src/images.png");
		richtigHaken.setIcon(haken);
		richtigHaken.setBounds(600, 20, 1000, 1000);
		//lePanel.setLayout(new GridBagLayout());
		richtigHaken.setVisible(false);
		lePanel.add(richtigHaken);

		enterButton = new JButton("Enter Word");
		enterButton.setBounds(250, 100, 120, 30);
		enterButton.addActionListener(new ActionListener(){  
			String enteredWord;
			public void actionPerformed(ActionEvent e){
				enteredWord = englishWordInput.getText();
				englishWordInput.setText("");
				System.out.println(enteredWord);
				
				Boolean guessedRight = voc.guess(enteredWord);
				if(guessedRight){
					System.out.println("YEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
					VokabelWort nvoc = voc.getNextVoc();
					String nvocstr = nvoc.word;
					System.out.println(nvocstr);
					richtigHaken.setVisible(true);
					vocabelText.setText(nvocstr);
				}
				else{
					System.out.println("nuts");
				}
			}

		});
			lePanel.add(enterButton);
			
			
			switchPanelButton = new JButton("Beende Prüfung");
			switchPanelButton.setBounds(250, 140, 120, 25);
			switchPanelButton.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){
					changeFrame();	
					
					}  
					}
				);
				lePanel.add(switchPanelButton);
		
				lePanel.setLayout(null);
				lePanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
		
		pruefungFrame.setPreferredSize(new DimensionUIResource(1000, 1000));
		pruefungFrame.add(lePanel, BorderLayout.CENTER);
		pruefungFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pruefungFrame.setTitle("bruh");
		pruefungFrame.pack();
		pruefungFrame.setVisible(false);
	}


	public GUI(){
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e){
			e.printStackTrace();
		}
		voc = new Vokabeltest();
		testingShit();
		initializeAddFrame();
		initializePruefungFrame();
		AddWordFrame.setVisible(true);
		pruefungFrame.setVisible(false);
		
	}


	private void changeFrame(){
		if(AddWordFrame.isVisible()){
			AddWordFrame.setVisible(false);
			pruefungFrame.setVisible(true);
		}
		else{
			AddWordFrame.setVisible(true);
			pruefungFrame.setVisible(false);
		}

	}

	
	private void testingShit(){
		voc.addVoc("bean","BEEEEEANZ");
        voc.addVoc("bruh","reeee");
        voc.addVoc("bbbbb","Yeeeeeeet");	
	}

	
}
