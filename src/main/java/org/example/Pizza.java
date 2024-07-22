package org.example;

public class Pizza {
    private String topping;
    private int size;
    private static int count;

    public Pizza(String topping, int size) {
        this.topping = topping;
        this.size = size;
    }

    public void sayOrder() {
        System.out.println("You just ordered a " + topping + ", " + size + " inch pizza!");
    }

    public static void incrementPizza() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
