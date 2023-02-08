package javabasics._5;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
        exercise5Bonus();
        playAroundWithModulus();
    }

    /*
            Remember the symbols you need to do maths are

            Plus = +
            Minus = -
            Multiply or times = *
            Divide = /
     */

    /**
     * 1: Create an int variable, add 1 to the value and then print it. Use the + operator
     * Then minus 1 from the same variable and print it.
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int variable = 6;
        int increasedVariable = variable + 1;
        int decreasedVariable = variable - 1;
        System.out.println("La variabile di partenza è " + variable);
        System.out.println("La variabile incrementata di 1 è " + increasedVariable);
        System.out.println("La variabile decrementata di 1 è " + decreasedVariable);

    }

    /**
     * 2: Create a double variable, times by 2 and then print it.
     * <p>
     * Create another double variable, which is the previous variable divided by 2
     * and then print it
     */
    private static void exercise2() {
        System.out.println("Exercise 2:");
        // Write your code here
        double doubleVariable = 10.4;
        double doubleVariableTwoTimes = doubleVariable * 2;
        System.out.println("La variavile di partenza è " + doubleVariable);
        System.out.println("La variabile moltiplicata per 2 è " + doubleVariableTwoTimes);
        double anotherDoubleVariable = doubleVariable / 2;
        System.out.println("La variabile divisa per 2 è " + anotherDoubleVariable);
    }

    /**
     * 3: We are going to convert the temperature from celsius to fahrenheit
     * <p>
     * Create a double variable called celsius
     * <p>
     * Create a new variable called fahrenheit
     * <p>
     * The variable fahrenheit should be set as
     * celsius times by 1.8 plus 32
     * <p>
     * Print out celsius and fahrenheit with 2 print statements
     */
    private static void exercise3() {
        System.out.println("Exercise 3:");
        // Write your code here
        double celsius = 25.5;
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("La temperatura in gradi celsius è " + celsius);
        System.out.println("La temperatura convertita in fahrenheit è " + fahrenheit);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age with a starting value of 10.
     * <p>
     * Only using the '++' operator increase this value to 15
     */
    private static void exercise4Bonus() {
        System.out.println("Exercise 4:");
        // Write your code here
        int age = 10;
        int agePlusFive = (age + 5); // NON SAPEVO COME FARE USANDO SEMPLICEMENTE IL ++
        System.out.println(agePlusFive);

    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age set as 50
     * <p>
     * Using the -= operator change this value from 50 to 0 in one line of code,
     * <p>
     * Underneath create another int called secondAge set as 50
     * <p>
     * Change this value from 50 to 0 in 3 lines of code
     */
    private static void exercise5Bonus() {
        System.out.println("Exercise 5:");
        // Write your code here
        int age = 50;
        System.out.println(age -= 50);

        int secondAge = 50; // HO DIFFICOLTA AD ANDARE AVANTI



    }

    /**
     * This is completely optional, but if you guys want to play around with
     * modulus to get a better understanding. Simply change the code below
     */
    private static void playAroundWithModulus() {
        System.out.println("Modulus testing!:");

        int value = 100;   // <--- change this value
        int modulus = 35; // <--- and this value to see the results of modulus

        System.out.println("Modulus calculation, " + value + " % " + modulus +
                "=" + value % modulus);
    }

}
