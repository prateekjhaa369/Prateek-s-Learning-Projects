import javax.swing.*;
import java.awt.*;
public class OrderScreen {
    public void showOrderScreen(Order order){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));        JLabel restaurantName = new JLabel("Restaurant Name: ");
        JLabel customername = new JLabel("Customer Name: ");
        JLabel foodItem = new JLabel("Food Item: ");
        JLabel quantity = new JLabel("Quantity: ");
        JLabel price = new JLabel("Price: ");
        JLabel address = new JLabel("Address: ");

        JTextField restaurantfield = new JTextField(15);
        JTextField customerfield = new JTextField(15);
        JTextField fooditemfield = new JTextField(15);
        JTextField quantityfield = new JTextField(15);
        JTextField pricefield = new JTextField(15);
        JTextField addressfield = new JTextField(15);


        JButton button = new JButton("Place Order");

        restaurantName.add(restaurantfield);
        customername.add(customerfield);
        foodItem.add(fooditemfield);
        quantity.add(quantityfield);
        price.add(pricefield);
        address.add(addressfield);

        panel.add(restaurantName);
        panel.add(restaurantfield);

        panel.add(customername);
        panel.add(customerfield);

        panel.add(foodItem);
        panel.add(fooditemfield);

        panel.add(quantity);
        panel.add(quantityfield);

        panel.add(price);
        panel.add(pricefield);

        panel.add(address);
        panel.add(addressfield);

        panel.add(button);

        frame.add(panel);
        frame.setSize(800,600);

        restaurantName.setFont(new Font("Arial",Font.BOLD,20));
        customername.setFont(new Font("Arial",Font.BOLD,20));
        foodItem.setFont(new Font("Arial",Font.BOLD,20));
        quantity.setFont(new Font("Arial",Font.BOLD,20));
        price.setFont(new Font("Arial",Font.BOLD,20));
        address.setFont(new Font("Arial",Font.BOLD,20));

        button.setBackground(Color.gray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }
}
