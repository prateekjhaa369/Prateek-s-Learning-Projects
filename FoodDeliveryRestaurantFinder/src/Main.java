import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Restaurant> restaurants = Arrays.asList(
                new Restaurant(101, "Pizza Palace", "Italian", 4.5, true),
                new Restaurant(102, "Spice Hub", "Indian", 4.2, true),
                new Restaurant(103, "Burger Point", "American", 4.0, false),
                new Restaurant(104, "Dragon Bowl", "Chinese", 4.4, true)
        );

        RestaurantService service =
                new RestaurantService(restaurants);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter restaurant ID: ");
        int id = scanner.nextInt();

        Optional<Restaurant> result =
                service.findRestaurantById(id);

        if(result.isPresent()){
            Restaurant restaurant = result.get();
            System.out.println("Restaurant Found:");
            System.out.println(restaurant);
        }
        else{
            System.out.println("Restaurant Not Found");
        }
    }
}