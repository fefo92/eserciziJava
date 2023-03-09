package javaadvanced._6_Enum;

import java.time.DayOfWeek;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * <p>
     * Loop over the values with Days.values() and print them out.
     */
    private enum Days {
        MONDAY(false), TUESDAY(false), WEDNESDAY(false), THURSDAY(false),
        FRIDAY(false), SATURDAY(true), SUNDAY(true);


        private final boolean isWeekend;

        Days(boolean isWeekend) {
            this.isWeekend = isWeekend;
        }
    }

    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

        for (Days days : Days.values()) {
            System.out.println(days);
        }
    }
    /**
     * 2:
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * <p>
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */
    private enum Seasons {
        SPRING, SUMMER, FALL, WINTER
    }

    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Seasons seasons = Seasons.SUMMER;
        switch (seasons) {
            case SPRING -> System.out.println("Da 21/3 a 20/6");
            case SUMMER -> System.out.println("Da 21/6 a 22/9");
            case FALL -> System.out.println("Da 23/9 a 21/12");
            case WINTER -> System.out.println("Da 22/12 a 20/3");
        }

    }

    /**
     * 3:
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * <p>
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     */
    private enum TrafficLight {
        RED, YELLOW, GREEN
    }

    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        TrafficLight trafficLight = TrafficLight.GREEN;

        switch (trafficLight) {
            case RED -> System.out.println("Ora è rosso, attendi per il verde...");
            case YELLOW -> System.out.println("Ora è giallo, attento sta per diventare rosso!!!");
            case GREEN -> System.out.println("E' verde, via libera, ma tra poco diveterà giallo.");
        }
    }

    /**
     * 4:
     * <p>
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * <p>
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        Days day = Days.SATURDAY;
        if (day.isWeekend) {
            System.out.println(day + " is weekend");
        } else {
            System.out.println(day + " is weekday");
        }

    }

    /**
     * 5:
     * <p>
     * <p>
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * <p>
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;
    }

}
