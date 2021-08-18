package ua.solution.masliuk.matrix.HW;

public class MainConcurrency {

    private static int countOfPC = 0;
    public static int user1PC = 0;
    public static int user2PC = 0;
    public static int idTread = 0;

    public void setCountOfPC(int countOfPC) {
        MainConcurrency.countOfPC = countOfPC;
    }
    public static void main(String[] args) throws InterruptedException{

        final int m = 5;
        final int n = 6;
        final int k = 3;

        int[][] array1 = {{1,2,12,5,2,3},
                          {1,2,12,5,2,3},
                          {1,2,12,5,2,3},
                          {1,2,12,5,2,3},
                          {1,2,12,5,2,3}};

        int[][] array2 = {{3,2,1},
                          {3,5,6},
                          {3,2,1},
                          {3,5,6},
                          {3,2,1},
                          {3,5,6}};

        int[][] result = new int[m][k];

        Thread firstMyThread = new Thread(()-> {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < m/2; i++) {
            for (int j = 0; j < k; j++) {
                for (int s = 0; s < n; s ++) {
                    result[i][j] += array1[i][s] * array2[s][j];

                }
                System.out.print(result[i][j] + " ");
            }

        }
        System.out.println(" ");
        long endTime = System.currentTimeMillis();
        System.out.println("Total time firstThread: " + (endTime - startTime) + "ms");});

        Thread secondMyThread = new Thread(()-> {
            long startTime = System.currentTimeMillis();
            for (int i = m/2; i < m; i++) {
                for (int j = 0; j < k; j++) {
                    for (int s = 0; s < n; s++) {
                        result[i][j] += array1[i][s] * array2[s][j];

                    }
                    System.out.print(result[i][j] + " ");
                }

            }
            System.out.println(" ");
            long endTime = System.currentTimeMillis();
            System.out.println("Total time secondThread: " + (endTime - startTime) + "ms");});

        firstMyThread.start();
        firstMyThread.join();
        secondMyThread.start();

        /////////////Второе задание

        Warehouse warehouse = new Warehouse();
        Thread myThread1 = new Thread(new MyThread(0, warehouse));

        Thread myThread2 = new Thread(new MyThread(1, warehouse));

        Thread addPC = new Thread(new MyAddThread(warehouse));

        addPC.start();
        myThread1.start();
        myThread2.start();

    }
}
