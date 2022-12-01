import java.awt.BorderLayout;

import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.*;  
import javax.swing.*;   



public class GUI{
	private static JFrame frame;
	private static JPanel panel;
	private static JLabel germanLabel;
	private static JTextField germanWordInput;
	private static JLabel englishLabel;
	private static JTextField wordInput;
	private static JButton button;
	private static JLabel warningText;

	public GUI(){
		Vokabeltest voc = new Vokabeltest();
		frame = new JFrame();
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
		
		wordInput = new JTextField(30);
		wordInput.setBounds(175, 50, 250, 25);
		panel.add(wordInput);
		
		button = new JButton("Enter Word");
		button.setBounds(10, 85, 120, 25);
		button.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
						String germanword = germanWordInput.getText();
						String tanslatedWord = wordInput.getText();
						if(!germanword $$ translatedWord != null)
						voc.addVoc(germanword, tanslatedWord);
						warningText.setText("BRUH");
						warningText.setForeground(new ColorUIResource(255, 0, 0));
						warningText.setVisible(true);
					}  
				}
			);    	
		
		panel.add(button);


		//new GridLayout(0,1)
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
		
		frame.setPreferredSize(new DimensionUIResource(1000, 1000));
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("bruh");
		frame.pack();
		frame.setVisible(true);
	}

	
}
