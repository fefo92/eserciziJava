package javaoopadvanced._2_Abstract_classes_interfaces;

public abstract class Shape {
    private int height;
    private int width;

    public Shape(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public Shape() {

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double calculateArea() {
        return Math.PI * Math.pow((height / 2), 2);
    }
}
