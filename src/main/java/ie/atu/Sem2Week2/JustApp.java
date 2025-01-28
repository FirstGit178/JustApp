package ie.atu.Sem2Week2;

import java.util.ArrayList;

public class JustApp {

    public static void main(String[] args) {
        ArrayList<Food> items = new ArrayList<>();
        System.out.println("Welcome to Just App ");
        System.out.println("You ordered ....");

        //Add some items burgers, pizzas, fries, salad....
        Burger cheeseBurger = new Burger("Burger" , 4.99 , "Nice");
        Pizza tuna = new Pizza("Tuna", 7.99 , "Nice??? Mmmm... We will see");
        Pizza classic = new Pizza("Pineapple" , 5.99 , "Nice");
        Fries curry = new Fries("curry", 1.99,  "Also nice");
        //Add all the orders to a collection
        items.add(cheeseBurger);
        items.add(tuna);
        items.add(curry);

        //Display all the orders
        for(Food item : items)
        {
            System.out.println(item);

        }
        //Find the total cost of the whole order
    }
}
