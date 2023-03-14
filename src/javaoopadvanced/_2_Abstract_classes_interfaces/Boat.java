package javaoopadvanced._2_Abstract_classes_interfaces;

public class Boat implements Movable{
    @Override
    public void moveforward() {
        System.out.println("Vado avanti barca");
    }

    @Override
    public void movebackward() {
        System.out.println("Vado indietro barca");
    }
}
