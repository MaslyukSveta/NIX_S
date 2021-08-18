package example;

public class Lamp implements ElectricityConsumer{

    public void lightOn() {
        System.out.println("Лампа горит");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }
}
