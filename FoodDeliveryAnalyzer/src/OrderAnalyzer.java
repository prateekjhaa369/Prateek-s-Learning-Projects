import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class OrderAnalyzer {

    public Map<String, List<Order>> groupOrdersByRestaurant(
            List<Order> orders) {
        return orders.stream()
                .collect(Collectors.groupingBy(Order::getRestaurantName));
    }



    public Map<Boolean, List<Order>> partitionOrdersByValue(
            List<Order> orders, double threshold) {

        return orders.stream()
                .collect(Collectors.partitioningBy(order -> order.getOrderAmount() > threshold));
    }
}