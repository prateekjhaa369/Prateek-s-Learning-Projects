public class Order {

    private int orderId;
    private String customerName;
    private String restaurantName;
    private double orderAmount;

    public Order(int orderId, String customerName,
                 String restaurantName, double orderAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.restaurantName = restaurantName;
        this.orderAmount = orderAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", restaurantName='" + restaurantName + '\'' +
                ", orderAmount=" + orderAmount +
                '}';
    }
}