import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(

                new Order(101, "Rahul", "Pizza Palace", 450),
                new Order(102, "Aman", "Burger House", 250),
                new Order(103, "Priya", "Pizza Palace", 850),
                new Order(104, "Neha", "Biryani Point", 600),
                new Order(105, "Rohit", "Burger House", 1200),
                new Order(106, "Simran", "Pizza Palace", 300)
        );

        OrderAnalyzer analyzer = new OrderAnalyzer();

        Map<String, List<Order>> groupedOrders= analyzer.groupOrdersByRestaurant(orders);
        System.out.println(groupedOrders);
        
        Map<Boolean, List<Order>> partitionedOrders = analyzer.partitionOrdersByValue(orders,500);
        System.out.println(partitionedOrders);
    }
}