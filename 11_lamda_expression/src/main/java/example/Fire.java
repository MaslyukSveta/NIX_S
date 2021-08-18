package example;

public class Fire implements ElectricityConsumer {

    @Override
    public void electricityOn() {
        System.out.println("Пожар");
    }
}
