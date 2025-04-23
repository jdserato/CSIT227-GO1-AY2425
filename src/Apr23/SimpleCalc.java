package Apr23;

import javax.swing.*;

public class SimpleCalc extends JFrame {
    private JPanel pnlMain;
    private JTextField tfNumber1;
    private JComboBox<String> cbOperation;
    private JButton btnCalculate;
    private JTextField tfNumber2;
    private JTextField tfResult;

    SimpleCalc() {
        btnCalculate.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(tfNumber1.getText());
                System.out.println(num1);
                double num2 = Double.parseDouble(tfNumber2.getText());
                System.out.println(num2);
                char op = ((String) cbOperation.getSelectedItem()).charAt(0);
                switch (op) {
                    case '+':
                        tfResult.setText(num1 + num2 + "");
                        break;
                    case '-':
                        tfResult.setText(num1 - num2 + "");
                        break;
                    case '*':
                        tfResult.setText(num1 * num2 + "");
                        break;
                    case '/':
                        if (num2 == 0) {
                            JOptionPane.showMessageDialog(this, "Cannot divide by zero");
                            tfResult.setText("ERR");
                        } else {
                            tfResult.setText(String.format("%.2f", num1 / num2));
                        }
                        break;
                }
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(this, "Invalid input");
                tfNumber1.setText("");
                tfNumber2.setText("");
            }

        });
    }

    public static void main(String[] args) {
        SimpleCalc app = new SimpleCalc();
        app.setContentPane(app.pnlMain);
        app.setSize(550, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
