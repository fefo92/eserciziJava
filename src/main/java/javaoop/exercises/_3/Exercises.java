package javaoop.exercises._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     * <p>
     * Make sure there are 5 fields inside, if they are not simply create some more.
     * make every field private first.
     * <p>
     * Then create getters and setters for each of these 5 fields.
     * <p>
     * Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Student student = new Student("Stefano", 30,
                170, "Brescia", 65);
        Student student2 = new Student("Luca", 25,
                180, "Milano", 100);


        System.out.println(student.getCity());
        System.out.println(student.setCity("Bologna"));
        System.out.println(student2.getAge());
        System.out.println(student2.setAge(50));
        System.out.println(student2.getHeight());
        System.out.println(student2.setHeight(150));
        System.out.println(student2.getName());
        System.out.println(student2.setName("Pietro"));
        System.out.println(student2.getWeight());
        System.out.println(student2.setWeight(75));

    }

    /**
     * 2: Create 3 setter constraints for the student class
     * <p>
     * Think about what reasonably constraints are?
     * <p>
     * Should a student be able to be a negative age?
     * <p>
     * Create a counter for one of the getters, try to think about
     * what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here

        //QUESTO ERA LE'ESERCIZIO IN CHE NON RIUSCIVAMO A CAPIRE COSA SI DOVEVA FARE IN LIVE

    }

}
