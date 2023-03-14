package javaoopadvanced._2_Abstract_classes_interfaces;

public class Car implements Movable {
    @Override
    public void moveforward() {
        System.out.println("Vado avanti auto");
    }

    @Override
    public void movebackward() {
        System.out.println("Vado indietro auto");
    }
}
