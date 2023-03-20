package javaoopadvanced._1_Inheritance;

public class Bird extends Animal {
    private int wingSpan;

    public Bird(double height, double weight, int wingSpan) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public double flySpeedMetersPerSecond() {
        return getWingSpan() * 4;
    }
}
