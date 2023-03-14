package javaoopadvanced._2_Abstract_classes_interfaces;

public class Piano extends Instrument implements Playable{
    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("Sta suonando il piano");
    }
}
