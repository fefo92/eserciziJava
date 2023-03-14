package javaoopadvanced._1_Inheritance;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create a class called "Dog" that extends the Animal class.
     * <p>
     * Add a new field called "breed" to the Dog class.
     * <p>
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     * <p>
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog dog = new Dog(55, 25, true);
        Dog dog2 = new Dog(60, 30, false);
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     * <p>
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     * <p>
     * Also create constructors, getters and setters
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Fish fish = new Fish(5, 0.5, "Pesce palla");
        Bird bird = new Bird(5, 1.2, 100);
    }

    /**
     * 3:
     * <p>
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     * <p>
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog dog = new Dog(60, 30, false);
        Fish fish = new Fish(5, 0.5, "Pesce palla");
        Bird bird = new Bird(5, 1.2, 100);

        double fastestSpeed = 0;
        String fastestAnimal = "";

        double dogSpeed = dog.runSpeedMetersPerSecond();
        if (dogSpeed > fastestSpeed) {
            fastestSpeed = dogSpeed;
            fastestAnimal = "Dog";
        }

        double fishSpeed = fish.swimSpeedMetersPerSecond();
        if (fishSpeed > fastestSpeed) {
            fastestSpeed = fishSpeed;
            fastestAnimal = "Fish";
        }

        double birdSpeed = bird.flySpeedMetersPerSecond();
        if (birdSpeed > fastestSpeed) {
            fastestSpeed = birdSpeed;
            fastestAnimal = "Bird";
        }

        System.out.println(fastestAnimal + " is the fastest animal with a speed of " + fastestSpeed + " m/s.");
    }
}



