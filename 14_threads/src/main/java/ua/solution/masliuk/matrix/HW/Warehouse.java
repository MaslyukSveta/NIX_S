package ua.solution.masliuk.matrix.HW;

public class Warehouse {

    private int countOfPc = 0;

    public int getCountOfPc() {
        return countOfPc;
    }

    public void setCountOfPc(int countOfPc) {
        this.countOfPc = countOfPc;
    }
    public synchronized int addPc() {
        if(countOfPc < 21) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countOfPc += 3;
            System.out.println("ПК на складе: " + countOfPc);
        }
        return 0;
    }

}
