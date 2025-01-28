package ie.atu.Sem2Week2;

public class Burger implements Food {
    String name;
    double price;
    String description;
    String getDetails;

    public String getGetDetails() {
        return getDetails;
    }

    public void setGetDetails(String getDetails) {
        this.getDetails = getDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Burger(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", getDetails='" + getDetails + '\'' +
                '}';
    }
}
