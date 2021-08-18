package ua.solution.masliuk.matrix.HW;

public class MyThread implements Runnable{

    public int userPC = 0;
    public int id ;
    final Warehouse warehouse;

    public MyThread(int id, Warehouse warehouse){
        this.id = id;
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        while (userPC != 10) {
            synchronized (warehouse) {

                if (id == 0) {
                    System.out.println("Первый поток");

                    try {
                        Thread.sleep(7000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                } else {
                    System.out.println("Второй поток");
                    try {
                        Thread.sleep(7000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }

                if (warehouse.getCountOfPc() - 2 >= 0) {
                    warehouse.setCountOfPc(warehouse.getCountOfPc() - 2);
                    userPC += 2;
                }
                System.out.println("ПК после потребителя: " + warehouse.getCountOfPc() + " ПК у потребителя: " + userPC);

            }


        }
    }
}
