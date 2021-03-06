package consoleProgramming.encrypting;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.Format;

public class EncryptingWithGui extends JPanel implements PropertyChangeListener{

    private JLabel CLEAR_TEXT_LABEL;
    private JLabel ENCRYPTED_TEXT_LABEL;
    private JLabel CLEAR_TEXT_LABEL_DECRYPT;
    private JLabel DECRYPTED_TEXT_LABEL;
    private JLabel HEADER_LABEL;

    private static String CLEAR_TEXT_STRING = "Wort: ";
    private static String ENCRYPTED_TEXT_STRING = "Verschlüsselt: ";
    private static String CLEAR_TEXT_STRING_DECRYPT = "Wort: ";
    private static String DECRYPTED_TEXT_STRING = "Entschlüsselt: ";
    private static String HEADER_STRING = "Caesar Verschlüsselung";

    private JFormattedTextField CLEAR_TEXT_FIELD;
    private JFormattedTextField ENCRYPTED_TEXT_FIELD;
    private JFormattedTextField CLEAR_TEXT_FIELD_DECRYPT;
    private JFormattedTextField DECRYPTED_TEXT_FIELD;

    private JButton GO_BUTTON;

    private Format CLEAR_TEXT_FORMAT;
    private Format ENCRYPTED_TEXT_FORMAT;
    private Format CLEAR_TEXT_FORMAT_DECRYPT;
    private Format DECRYPTED_TEXT_FORMAT;
    private Format HEADER_TEXT_FORMAT;

    public EncryptingWithGui(){
        super(new BorderLayout());

        //Labels zum Identifizieren
        CLEAR_TEXT_LABEL = new JLabel(CLEAR_TEXT_STRING);
        ENCRYPTED_TEXT_LABEL = new JLabel(ENCRYPTED_TEXT_STRING);

        CLEAR_TEXT_LABEL_DECRYPT = new JLabel(CLEAR_TEXT_STRING_DECRYPT);
        DECRYPTED_TEXT_LABEL = new JLabel(DECRYPTED_TEXT_STRING);

        HEADER_LABEL = new JLabel(HEADER_STRING, SwingConstants.CENTER);
        HEADER_LABEL.setFont(new Font(Font.SERIF, Font.PLAIN, 50));

        GO_BUTTON = new JButton("Starte Ver-/Entschlüsselung");

        //Fields zum Auslesen der Werte
        //ENCRYPT
        CLEAR_TEXT_FIELD = new JFormattedTextField(CLEAR_TEXT_FORMAT);
        CLEAR_TEXT_FIELD.setValue("");
        CLEAR_TEXT_FIELD.setColumns(20);
        CLEAR_TEXT_FIELD.addPropertyChangeListener("value", this);

        ENCRYPTED_TEXT_FIELD = new JFormattedTextField(ENCRYPTED_TEXT_FORMAT);
        ENCRYPTED_TEXT_FIELD.setValue("");
        ENCRYPTED_TEXT_FIELD.setColumns(20);
        ENCRYPTED_TEXT_FIELD.setEditable(false);
        ENCRYPTED_TEXT_FIELD.addPropertyChangeListener("value", this);

        //DECRYPT
        CLEAR_TEXT_FIELD_DECRYPT = new JFormattedTextField(CLEAR_TEXT_FORMAT_DECRYPT);
        CLEAR_TEXT_FIELD_DECRYPT.setValue("");
        CLEAR_TEXT_FIELD_DECRYPT.setColumns(20);
        CLEAR_TEXT_FIELD_DECRYPT.addPropertyChangeListener("value", this);

        DECRYPTED_TEXT_FIELD = new JFormattedTextField(DECRYPTED_TEXT_FORMAT);
        DECRYPTED_TEXT_FIELD.setValue("");
        DECRYPTED_TEXT_FIELD.setColumns(20);
        DECRYPTED_TEXT_FIELD.setEditable(false);
        DECRYPTED_TEXT_FIELD.addPropertyChangeListener("value", this);

        //Verbindung der Label mit Fields
        CLEAR_TEXT_LABEL.setLabelFor(CLEAR_TEXT_FIELD);
        ENCRYPTED_TEXT_LABEL.setLabelFor(ENCRYPTED_TEXT_FIELD);

        CLEAR_TEXT_LABEL_DECRYPT.setLabelFor(CLEAR_TEXT_FIELD_DECRYPT);
        DECRYPTED_TEXT_LABEL.setLabelFor(DECRYPTED_TEXT_FIELD);

        //Erstellen von Eingabefenster

        JPanel LABEL_PANE_ENCRYPT = new JPanel(new GridLayout(0, 1));
        LABEL_PANE_ENCRYPT.add(CLEAR_TEXT_LABEL);
        LABEL_PANE_ENCRYPT.add(ENCRYPTED_TEXT_LABEL);

        JPanel LABEL_PANE_DECRYPT = new JPanel(new GridLayout(0, 1));
        LABEL_PANE_DECRYPT.add(CLEAR_TEXT_LABEL_DECRYPT);
        LABEL_PANE_DECRYPT.add(DECRYPTED_TEXT_LABEL);

        JPanel FIELD_PANE_ENCRYPT = new JPanel(new GridLayout(0, 1));
        FIELD_PANE_ENCRYPT.add(CLEAR_TEXT_FIELD);
        FIELD_PANE_ENCRYPT.add(ENCRYPTED_TEXT_FIELD);

        JPanel FIELD_PANE_DECRYPT = new JPanel(new GridLayout(0, 1));
        FIELD_PANE_DECRYPT.add(CLEAR_TEXT_FIELD_DECRYPT);
        FIELD_PANE_DECRYPT.add(DECRYPTED_TEXT_FIELD);

        //Verbinden von Beschreibung und Eingabe
        JPanel ENCRYPT_PANE = new JPanel();
        ENCRYPT_PANE.add(LABEL_PANE_ENCRYPT, BorderLayout.WEST);
        ENCRYPT_PANE.add(FIELD_PANE_ENCRYPT, BorderLayout.CENTER);


        JPanel DECRYPT_PANE = new JPanel();
        DECRYPT_PANE.add(LABEL_PANE_DECRYPT, BorderLayout.WEST);
        DECRYPT_PANE.add(FIELD_PANE_DECRYPT, BorderLayout.EAST);

        //Einbinder der Fenster im Hauptfenster
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(HEADER_LABEL, BorderLayout.NORTH);
        add(GO_BUTTON, BorderLayout.SOUTH);
        add(ENCRYPT_PANE, BorderLayout.WEST);
        add(DECRYPT_PANE, BorderLayout.EAST);

    }
    //Algorithmus zum erstellen des Fensters
    private static void createGui(){
        JFrame JFRAME = new JFrame("CaesarVerschlüsselung");
        JFRAME.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JFRAME.add(new EncryptingWithGui());
        JFRAME.setVisible(true);
        JFRAME.pack();
    }
    //Abkopiert, da in der Erklärung von Swing stand das dies Fehler beim Ausführen verhindert (Jedoch eher als Datei compiliert und nicht in der Entwicklungsumgebung).
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                createGui();
            }
        });
    }
    //Implementierte Methode --> Überprüfung der Eingabe Felder
    @Override
    public void propertyChange(PropertyChangeEvent e) {
        if (GO_BUTTON.getModel().isPressed()){
            try {
                ENCRYPTED_TEXT_FIELD.setValue(encrypt(CLEAR_TEXT_FIELD.getValue().toString().toLowerCase()));
                DECRYPTED_TEXT_FIELD.setValue(decrypt(CLEAR_TEXT_FIELD_DECRYPT.getValue().toString().toLowerCase()));
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
    // Algorithmus zum Verschlüsseln
    private static String encrypt(String string){
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
    //Algorithmus zum Entschlüsseln
    private static String decrypt(String string){
        StringBuilder STRINGBUILDER = new StringBuilder();
        int TO_ADD = 0;
        for (char ONECHAR : string.toLowerCase().toCharArray()){
            if ((int)ONECHAR <= 98)
                TO_ADD = (int)ONECHAR + 24;
            else
                TO_ADD = (int)ONECHAR - 2;
            STRINGBUILDER.append((char)TO_ADD);
        }
        return STRINGBUILDER.toString();
    }
}
