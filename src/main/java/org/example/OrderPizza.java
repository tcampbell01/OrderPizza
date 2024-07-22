package org.example;

public class OrderPizza {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza("Pepperoni", 12);
        myPizza.sayOrder();
        Pizza.incrementPizza();
        System.out.println("Total pizzas ordered: " + Pizza.getCount());
    }
}
