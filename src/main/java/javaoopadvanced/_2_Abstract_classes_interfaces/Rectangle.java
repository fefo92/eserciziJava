package javaoopadvanced._2_Abstract_classes_interfaces;

public class Rectangle extends Shape {
    public Rectangle(int height, int width) {
        super(height, width);
    }

    public Rectangle() {
    }


    @Override
    public double calculateArea() {
        return super.calculateArea();
    }
}
