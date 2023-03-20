package javaoopadvanced._1_Inheritance;

public class Dog extends Animal {

    private boolean breed;

    public Dog(double height, double weight, boolean breed) {
        super(height, weight);
        this.breed = breed;
    }

    public boolean isBreed() {
        return breed;
    }

    public void setBreed(boolean breed) {
        this.breed = breed;
    }

    public double runSpeedMetersPerSecond() {
        return getHeight() * 2;

    }
}
