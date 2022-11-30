import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SwingUtilities;
import javax.swing.plaf.DimensionUIResource;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI implements ActionListener {
	private static JFrame frame;
	private static JPanel panel;
	private static JLabel germanLabel;
	private static JTextField germanWordInput;
	private static JLabel englishLabel;
	private static JTextField wordInput;
	private static JButton button;

	public GUI(){
		frame = new JFrame();
		panel = new JPanel();


		
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
		button.addActionListener(new GUI());
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

	@Override
	public void actionPerformed(ActionEvent e) {
		String testText = wordInput.getText();
		System.out.println(testText);
		
	}
}
