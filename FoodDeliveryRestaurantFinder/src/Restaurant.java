public class Restaurant {

    private int id;
    private String name;
    private String cuisine;
    private double rating;
    private boolean open;

    // Constructor
    public Restaurant(int id, String name, String cuisine, double rating, boolean open) {
        this.id = id;
        this.name = name;
        this.cuisine = cuisine;
        this.open = open;
        this.rating = rating;
    }
    // Getters
    public double getRating() {
        return rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public boolean isOpen() {
        return open;
    }
    // toString()
    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cuisine='" + cuisine + '\'' +
                ", rating=" + rating +
                ", open=" + open +
                '}';
    }
}