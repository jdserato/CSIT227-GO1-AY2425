package Apr23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrder extends JFrame {
    private JPanel pnlMain;
    private JCheckBox cbPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cbBurger;
    private JCheckBox cbFries;
    private JCheckBox cbSoftDrinks;
    private JCheckBox cbTea;
    private JCheckBox cbSundae;
    private JRadioButton rbFive;
    private JRadioButton rbTen;
    private JRadioButton rbFifteen;
    private JRadioButton[] rbDiscounts = {rbNone, rbFifteen, rbFive, rbTen};
    private int[] discount =             {0,        15,         5,      10};
    private JCheckBox[] cbFoods = {cbPizza, cbBurger, cbFries, cbSoftDrinks, cbTea, cbSundae};
    private int[] prices =          {100,       80,     65,         55,         50,     40  };

    FoodOrder() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sum = 0;
                for (int i = 0; i < cbFoods.length; i++) {
                    if (cbFoods[i].isSelected()) {
                        sum += prices[i];
                    }
                }
                double disc = 0;
                for (int i = 0; i < rbDiscounts.length; i++) {
                    if (rbDiscounts[i].isSelected()) {
                        disc = discount[i];
                    }
                }
                disc /= 100;
                System.out.printf("The total price is Php %.2f", sum);
                System.out.println("You selected " + disc + " discount");
                double total = sum * disc;
                System.out.printf("ACTUAL FINAL TOTAL: Php %.2f\n", sum - total);
                JOptionPane.showMessageDialog(null, String.format("The total price is Php %.2f", sum  - total));
            }
        });
    }

    public static void main(String[] args) {
        FoodOrder app = new FoodOrder();
        app.setContentPane(app.pnlMain);
        app.setSize(550, 550);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
