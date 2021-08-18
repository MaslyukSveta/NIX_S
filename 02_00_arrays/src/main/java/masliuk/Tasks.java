package masliuk;

import java.util.Arrays;

public class Tasks {


    /**
     * Вывести элементы числового массива, которые больше, чем элементы,
     * стоящие перед ними.
     * Например, дан массив [3, 9, 8, 4, 5, 1]. Следует вывести числа 9 и 5, так как
     * перед ними стоят соответственно числа 3 и 4, которые меньше их.
     * @param a
     */
    public static void task1(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
               System.out.println(a[i + 1]);
            }
        }

    }

    /**
     * В массиве найти минимальный и максимальный элементы, поменять их
     * местами.
     * @param a
     */

    public static void task2(int[] a) {

        int max = 0;
        int min = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[max]) {
                max = i;
            }
            if (a[i] < a[min]) {
                min = i;
            }
        }

        int tmp = a[max];
        a[max] = a[min];
        a[min] = tmp;

        System.out.println(Arrays.toString(a));

    }

    /**
     * Найти сумму тех элементов массива, которые одновременно имеют
     * четные и отрицательные значения.
     *
     * Например, в массиве [3, -5, -2, 4, -8, 0] отрицательными четными
     * элементами являются числа -2 и -8. Их сумма равна -10.
     * @param a
     * @return sum
     */
    public int task3(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] < 0) {
                sum += a[i];
            }
        }
        return sum;
    }


}
