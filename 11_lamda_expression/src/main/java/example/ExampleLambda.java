package example;

public class ExampleLambda {
    public static void main(String [] args) {

        Switcher sw = new Switcher();

        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        sw.addElectricityConsumer(lamp);
        sw.addElectricityConsumer(radio);


        sw.addElectricityConsumer(new ElectricityConsumer() {
            @Override
            public void electricityOn() {
                System.out.println("Пожар");
            }
        });

        sw.addElectricityConsumer(() -> System.out.println("Пожар"));


        sw.addElectricityConsumer(ExampleLambda::fire);
        sw.switchOn();

    }
    public static void fire(){
        System.out.println("Пожар-чик");
    }
}
