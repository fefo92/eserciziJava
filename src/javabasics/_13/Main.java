package javabasics._13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * The print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();

        //Write your code here
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int casualNumber = random.nextInt(100);
            numbers.add(casualNumber);
        }
        System.out.println(numbers.get(0));
        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(0);
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));
    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("Exercise 2:");
        //Write your code here
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("Lasagne");
        menuItems.add("Carbonara");
        menuItems.add("Casoncelli al burro e salvia");
        menuItems.add("Fiorentina");

        ArrayList<Double> menuPrices = new ArrayList<>();
        menuPrices.add(10.00);
        menuPrices.add(11.00);
        menuPrices.add(8.00);
        menuPrices.add(50.00);

        System.out.println(menuItems.get(0) + ": " + menuPrices.get(0) + " €");
        System.out.println(menuItems.get(1) + ": " + menuPrices.get(1) + " €");
        System.out.println(menuItems.get(2) + ": " + menuPrices.get(2) + " €");
        System.out.println(menuItems.get(3) + ": " + menuPrices.get(3) + " €");
    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};

        //Write your code here
        int sum = items[0] + items[1] + items[2] + items[3] + items[4]
                + items[5] + items[6] + items[7] + items[8] + items[9];
        System.out.println(sum);

        int sum1 = Arrays.stream(items).sum();
        System.out.println(sum1);
        //ho trovato anche questo metodo più veloce ma non so se è corretto visto che non è trattato nella lezione
        //danno lo stesso risultato

    }
}
