package javabasics._4;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int myAge = 30;
        System.out.println("La mia età è " + myAge);

    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        char firstnameInitial = 'S';
                int myAge = 30;
        System.out.println("L'iniziale del mio nome è " + firstnameInitial + "La mia età è " + myAge);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        //si istanzia il valore booleano "ha pranzato" in una variabile
        boolean hasEatenLunch = false;
        //si istanzia il valore di un numero non intero che sarebbe quanto è costato il pranzo in una variabile
        double lunchCost = 5.99;
        // si stampano i valori nella console su 2 linee differenti conatenando strighe e variabili con il +
        System.out.println("Lunch cost=" + lunchCost);
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
