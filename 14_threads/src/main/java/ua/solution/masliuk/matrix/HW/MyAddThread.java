package ua.solution.masliuk.matrix.HW;

public class MyAddThread implements Runnable{

    final Warehouse warehouse;

    public MyAddThread( Warehouse warehouse){
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        while(warehouse.getCountOfPc() != 21) {
            synchronized (warehouse) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                warehouse.addPc();
            }
        }
    }
}
