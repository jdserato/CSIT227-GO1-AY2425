package Apr12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Anything extends JFrame {
    private JTextField tfName;
    private JPanel pnlMain;
    private JButton btnOk;
    private JRadioButton rbMale;
    private JRadioButton rbOthers;
    private JRadioButton rbFemale;
    private JTextArea taOutput;
    private JComboBox cbProgram;
    private JCheckBox cbC;
    private JCheckBox cbCpp;
    private JCheckBox cbJs;
    private JCheckBox cbPython;
    private JCheckBox cbJava;

    public Anything() {
        System.out.println("Starting application.");
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameEntered();
            }
        });

        tfName.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == '\n') {
                    nameEntered();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }

    public void nameEntered() {
        Student s = new Student(tfName.getText());
        tfName.setText("");
        tfName.requestFocus();
        JRadioButton[] bgGender = {rbMale, rbOthers, rbFemale};
        for (JRadioButton rb : bgGender) {
            if (rb.isSelected()) {
                s.setGender(rb.getText());
            }
        }
        s.setProgram((String) cbProgram.getSelectedItem());
        JCheckBox[] cbsLangs = {cbC, cbCpp, cbJava, cbPython, cbJs};
        for (JCheckBox cb : cbsLangs) {
            if (cb.isSelected()) {
                s.addLanguage(cb.getText());
            } else {
                s.removeLanguage(cb.getText());
            }
        }
        taOutput.setText("Hello, " + s);
        JOptionPane.showMessageDialog(this, "The total price");
    }

    public static void main(String[] args) {
        Anything app = new Anything();
        app.setContentPane(app.pnlMain);
        app.setSize(450, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
