package javaoopadvanced._3_Objectclass_Method_overriding_equals_toString;
public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
    /**
     * 1:
     *
     *
     * Create a class called "Person" with fields for name, age, and address.
     *
     * Override the `toString()` method in the Person class to display the object's name, age, and address in a user-friendly format.
     *
     * Create instances of the Person class and print them using the overridden `toString()` method.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Person person = new Person("Stefano", 30, "Via Roma");
        Person person1 = new Person("Pippo", 15, "Via Milano");
        Person person2 = new Person("Pluto", 80, "Via Torino");

        System.out.println(person.toString());
        System.out.println(person1.toString());
        System.out.println(person2.toString());

    }

    /**
     * 2:
     *
     *
     * Override the `hashCode()` method in the Person class to generate a unique hash code based on the object's name, age, and address.
     *
     * You can achieve this by using String.hashCode() to convert strings to ints and adding the fields together
     *
     * Create 2 people and print out their hashcodes
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person person = new Person("Stefano", 30, "Via Roma");
        Person person1 = new Person("Pippo", 15, "Via Milano");

        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
    }

    /**
     * 3:
     *
     * BONUS: Read about the nuances of hashcodes here:
     *
     * https://www.baeldung.com/java-hashcode
     *
     * Don't necessarily expect to understand it all right away, it can get quite complicated
     *
     */
}
