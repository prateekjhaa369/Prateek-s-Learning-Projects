import java.util.List;
import java.util.Optional;

public class RestaurantService {

    private List<Restaurant> restaurants;

    public RestaurantService(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public Optional<Restaurant> findRestaurantById(int id) {


        return restaurants.stream()
                .filter(restaurant -> restaurant.getId() == id)
                .findFirst();
    }
}