package masliuk;

import java.util.Map;
;import static masliuk.Iceberg.GetConnectedComponentsVolume;

public class Main {

    public static void main(String [] args) {


        int array[][] = {
                {1, 0, 0, 0, 0, 0},
                {1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 1, 1}};


        var volumes = GetConnectedComponentsVolume(array);

        volumes.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + "-" + e.getValue()));

        Tasks tasks = new Tasks();

        int a[]= new int[] {3, 9, 8, 4, 5, 1};

        int c[]= new int[]{3, -5, -2, 4, -8, 0};

        Tasks.task1(a);
        Tasks.task2(a);
        System.out.println(tasks.task3(c));


    }
}
