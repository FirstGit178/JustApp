package ie.atu;

public class JustApp {

    public static void main(String[] args) {
        ArrayList<Food> items = new ArrayList<>();
        System.out.println("Welcome to Just App ");
        System.out.println("You ordered ....");

        //Add some items burgers, pizzas, fries, salad....
        Burger cheeseBurger = new Burger();
        Pizza tuna = new Pizza();
        Pizza classic = new Pizza();
        Fries curry = new Fries(name:"curry", price 1.99, description "Also nice");
        //Add all the orders to a collection
        items.add(cheeseBurger);
        items.add(tuna);
        items.add(curry);

        //Display all the orders
        for(Food item : items)
        {
            System.out.println(item.getName());
            System.out.println(item.getPrice());
            System.out.println(item.getDescription());
            System.out.println(item.);
        }
        //Find the total cost of the whole order
    }
}
