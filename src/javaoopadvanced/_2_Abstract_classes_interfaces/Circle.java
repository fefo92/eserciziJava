package javaoopadvanced._2_Abstract_classes_interfaces;

public class Circle extends Shape {
    public Circle(int height, int width) {
        super(height, width);
    }
    public Circle(){

    }
    @Override
    public double calculateArea() {
        return super.calculateArea();
    }
}
