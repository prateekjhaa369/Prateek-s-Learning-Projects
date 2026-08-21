import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMWindow implements ActionListener {
    JFrame frame;
    JPanel panel;

    JLabel accountlabel;
    JLabel balancelabel;
    JLabel amountlabel;

    JButton withdrawbutton;
    JTextField amountfield;

    Account account;

    public ATMWindow(Account account) {
        this.account = account;
        frame = new JFrame("ATM Simulator");
        panel = new JPanel();

        accountlabel = new JLabel("Account Holder: " + account.accountHolder);
        balancelabel = new JLabel("Balance: ₹" + account.balance);

        amountlabel = new JLabel("Withdrawal Account:");
        amountfield = new JTextField(10);

        withdrawbutton = new JButton("WithDraw");

        panel.add(accountlabel);
        panel.add(balancelabel);
        panel.add(amountlabel);
        panel.add(amountfield);
        panel.add(withdrawbutton);

        frame.add(panel);

        withdrawbutton.addActionListener(this);

        frame.setSize(800,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String amountText = amountfield.getText();
        double amount = Double.parseDouble(amountText);

        if (amount <= account.balance) {
            account.balance = account.balance - amount;
            System.out.println("Withdrawal successful");
            System.out.println("Amount withdrawn: Rupees: " + amount);
            System.out.println("Remaining balance: Rupees: " + account.balance);
            balancelabel.setText("Balance: ₹" + account.balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}



