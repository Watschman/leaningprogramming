package consoleProgramming.encrypting;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.Format;

public class EncryptingWithGui extends JPanel implements PropertyChangeListener{

    private JLabel CLEAR_TEXT_LABEL;
    private JLabel ENCRYPTED_TEXT_LABEL;

    private static String CLEAR_TEXT_STRING = "Wort: ";
    private static String ENCRYPTED_TEXT_STRING = "Verschlüsselt: ";

    private JFormattedTextField CLEAR_TEXT_FIELD;
    private JFormattedTextField ENCRYPTED_TEXT_FIELD;

    private Format CLEAR_TEXT_FORMAT;
    private Format ENCRYPTED_TEXT_FORMAT;

    public EncryptingWithGui(){
        super(new BorderLayout());

        CLEAR_TEXT_LABEL = new JLabel(CLEAR_TEXT_STRING);
        ENCRYPTED_TEXT_LABEL = new JLabel(ENCRYPTED_TEXT_STRING);

        CLEAR_TEXT_FIELD = new JFormattedTextField(CLEAR_TEXT_FORMAT);
        CLEAR_TEXT_FIELD.setValue("");
        CLEAR_TEXT_FIELD.setColumns(10);
        CLEAR_TEXT_FIELD.addPropertyChangeListener("value", this);

        ENCRYPTED_TEXT_FIELD = new JFormattedTextField(ENCRYPTED_TEXT_FORMAT);
        ENCRYPTED_TEXT_FIELD.setValue("");
        ENCRYPTED_TEXT_FIELD.setColumns(10);
        ENCRYPTED_TEXT_FIELD.setEditable(false);
        ENCRYPTED_TEXT_FIELD.addPropertyChangeListener("value", this);

        CLEAR_TEXT_LABEL.setLabelFor(CLEAR_TEXT_FIELD);
        ENCRYPTED_TEXT_LABEL.setLabelFor(ENCRYPTED_TEXT_FIELD);

        JPanel LABEL_PANE = new JPanel(new GridLayout(0, 1));
        LABEL_PANE.add(CLEAR_TEXT_LABEL);
        LABEL_PANE.add(ENCRYPTED_TEXT_LABEL);

        JPanel FIELD_PANE = new JPanel(new GridLayout(0, 1));
        FIELD_PANE.add(CLEAR_TEXT_FIELD);
        FIELD_PANE.add(ENCRYPTED_TEXT_FIELD);

        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(LABEL_PANE, BorderLayout.CENTER);
        add(FIELD_PANE, BorderLayout.LINE_END);


    }
    public static void createGui(){
        JFrame JFRAME = new JFrame("CaesarVerschlüsselung");
        JFRAME.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JFRAME.add(new EncryptingWithGui());
        JFRAME.setVisible(true);
        JFRAME.pack();
    }

    private void setupFormats(){
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                createGui();
            }
        });
    }

    @Override
    public void propertyChange(PropertyChangeEvent e) {
        Object SOURCE = e.getSource();
        if (SOURCE == CLEAR_TEXT_FIELD){
            try {
                ENCRYPTED_TEXT_FIELD.setValue(encrypt(e.getNewValue().toString()));
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
    public static String encrypt(String string){
        StringBuilder STRINGBUILDER = new StringBuilder();
        int TO_ADD = 0;
        for (char ONECHAR : string.toLowerCase().toCharArray()){
            if ((int)ONECHAR >= 121)
                TO_ADD = (int)ONECHAR - 24;
            else
                TO_ADD = (int)ONECHAR + 2;
            STRINGBUILDER.append((char)TO_ADD);
        }
        return STRINGBUILDER.toString();
    }
}
