import java.awt.*;
import java.awt.event.*;


public class Buttons extends Frame {
  // Anfang Attribute
  private Button button1 = new Button();
  private TextField textField1 = new TextField();
  private Button button2 = new Button();
  private TextField textField2 = new TextField();
  private String inhalt = "";

  // Ende Attribute

  public Buttons(String title) {
    // Frame-Initialisierung
    super(title);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { dispose(); }
    });
    int frameWidth = 1437; 
    int frameHeight = 600;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(true);// Fenstergröße veränderlich
    Panel cp = new Panel(null);
    add(cp);
    // Anfang Komponenten

    button1.setBounds(24, 64, 241, 57);
    button1.setLabel("einlesen");
    button1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button1_ActionPerformed(evt);
      }
    });
    cp.add(button1);
    textField1.setBounds(280, 64, 641, 57);
    cp.add(textField1);
    button2.setBounds(24, 144, 241, 49);
    button2.setLabel("ausgeben");
    button2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button2_ActionPerformed(evt);
      }
    });
    button2.setEnabled(false);
    cp.add(button2);
    textField2.setBounds(280, 144, 641, 49);
    cp.add(textField2);

    // Ende Komponenten

    setVisible(true);
  }

  // Anfang Methoden
  public void button1_ActionPerformed(ActionEvent evt) {
    inhalt = textField1.getText();
    if (!inhalt.equals(""))
    {
      button2.setEnabled(true);
    }
  }

  public void button2_ActionPerformed(ActionEvent evt) {
    textField2.setText(inhalt);
  }


  // Ende Methoden

  public static void main(String[] args) {
    new Buttons("Buttons");
  }
}
  

