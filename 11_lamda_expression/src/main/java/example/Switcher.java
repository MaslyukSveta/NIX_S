package example;


import java.util.ArrayList;
import java.util.List;

public class Switcher {

    public List<ElectricityConsumer> consumers = new ArrayList<>();

    public void addElectricityConsumer(ElectricityConsumer consumer){
        consumers.add(consumer);
    }

    public void switchOn() {
        System.out.println("Выключатель ВКЛ");
        /**
        if (consumer != null) {
            consumer.electricityOn();
        }
         **/
        for(ElectricityConsumer c: consumers){
            c.electricityOn();
        }
    }
}
