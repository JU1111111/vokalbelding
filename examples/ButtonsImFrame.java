import java.awt.*;
import java.awt.event.*;


public class ButtonsImFrame extends Frame {
  // Anfang Attribute
  private Button button1 = new Button();
  private TextArea textArea1 = new TextArea("", 1, 1, TextArea.SCROLLBARS_BOTH);
  private Button button2 = new Button();
  private String inhalt = "";
  // Ende Attribute

  public ButtonsImFrame(String title) {
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

    button1.setBounds(32, 48, 289, 49);
    button1.setLabel("einlesen");
    button1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button1_ActionPerformed(evt);
      }
    });
    cp.add(button1);
    textArea1.setBounds(368, 48, 313, 313);
    cp.add(textArea1);
    button2.setBounds(32, 120, 289, 57);
    button2.setLabel("anhängen");
    button2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button2_ActionPerformed(evt);
      }
    });
    button2.setEnabled(false);
    button2.setVisible(false);
    cp.add(button2);
    // Ende Komponenten

    setVisible(true);
  }

  // Anfang Methoden
  public void button1_ActionPerformed(ActionEvent evt) {
    inhalt = textArea1.getText();
    if (! inhalt.equals(""))
    {
      button2.setVisible(true);
      button2.setEnabled(true);
    }
  }

  public void button2_ActionPerformed(ActionEvent evt) {
    textArea1.append(inhalt);
  }

  // Ende Methoden

  public static void main(String[] args) {
    new ButtonsImFrame("ButtonsImFrame");
  }
}
