package javaoopadvanced._2_Abstract_classes_interfaces;

public class Guitar extends Instrument implements Playable{
    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("Sta suonando la chitarra");
    }
}
