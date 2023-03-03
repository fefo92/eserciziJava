package javaadvanced._2_Maps;

import java.util.HashMap;
import java.util.Map;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Follow the steps below
     */
    private static void exercise1() {
        // 1a. Create a map of integers to strings
        Map<Integer, String> myFirstMap = new HashMap<>();

        // 1b. Add 3 elements to the map .put
        // 1c. Print the map
        // 1d. Access an element in the map with .get
        // 1e. Remove an element from the map .remove
        // 1f. Print the map again to confirm the element was removed
        myFirstMap.put(1, "Pippo");
        myFirstMap.put(2, "Topolino");
        myFirstMap.put(3, "Pluto");
        System.out.println(myFirstMap);
        System.out.println(myFirstMap.get(2));
        myFirstMap.remove(2);
        System.out.println(myFirstMap);
    }

    /**
     *  2: Follow the instructions in the code
     */
    private static void exercise2() {
        Map<String, Double> menuCostsInEuro = new HashMap<>();

        menuCostsInEuro.put("Fries", 3.50);
        menuCostsInEuro.put("Pizza", 11.80);
        menuCostsInEuro.put("Burger", 8.50);

        String mostExpensiveMenuItemName = null;
        double mostExpensiveMenuPrice = 0;

        // 2a. Loop over the map entries with menuCostsInEuro.entrySet()
        //     and set out the most expensive items name
        //     use for(Map.Entry<String, Double> entry : menuCostsInEuro.entrySet()) and entry.getKey and entry.getValue
        //     to do so

        // Your code
        for (Map.Entry<String, Double> entry : menuCostsInEuro.entrySet()){
            if (entry.getValue() > mostExpensiveMenuPrice) {
                mostExpensiveMenuPrice = entry.getValue();
                mostExpensiveMenuItemName = entry.getKey();

            }
        }

        if (mostExpensiveMenuItemName.equals("Pizza")) {
            System.out.println("2a. Correct!");
        } else {
            System.out.println("2a. Incorrect!");
        }
    }

    /**
     * 3: Follow the instructions in the code
     */
    private static void exercise3() {
        Map<String, Integer> fruitWeights = new HashMap<>();

        fruitWeights.put("Apple", 5);
        fruitWeights.put("Banana", 3);
        fruitWeights.put("Orange", 8);
        fruitWeights.put("Kiwi", 1);
        fruitWeights.put("Mango", 4);
        fruitWeights.put("Grapes", 8);
        fruitWeights.put("Peach", 5);
        fruitWeights.put("Pineapple", 1);

        int totalWeight = 0;
        // 3a. Use a for loop with fruitWeights.values() and sum up the total weight

        // Your code
        for (int weight : fruitWeights.values()) {
            totalWeight += weight;
        }

        if (totalWeight == fruitWeights.values().stream().mapToInt(Integer::intValue).sum()) {
            System.out.println("3. Correct!");
        } else {
            System.out.println("3. Incorrect!");
        }
    }
}
