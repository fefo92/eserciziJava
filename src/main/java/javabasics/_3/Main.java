package javabasics._3;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        char nameInitial = 'S';
        System.out.println("Il mio nome inizia con la lettera " + nameInitial);
        nameInitial = 'D';
        System.out.println("Il mio cognome inizia con la lettera " + nameInitial);

    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Write your code here
        int myAge = 30;
        System.out.println("La mia età è " + myAge);

        boolean hadLunch = true;
        System.out.println("Oggi ho pranzato= " + hadLunch);

        double lunchPriceEuro = 9.99;
        System.out.println("Il mio pranzo oggi è costato " + lunchPriceEuro);

    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.

     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        int myAge = 30;
        System.out.println("La mia età è " + myAge);

        boolean hadLunch = true;
        System.out.println("Oggi ho pranzato= " +hadLunch);

        double lunchPriceEuro = 9.99;
        System.out.println("Il mio pranzo oggi è costato " + lunchPriceEuro);
    }
}
