package masliuk;

import java.util.Hashtable;

public class Iceberg {

    /**
     * Функция для чтения значений поля
     *
     * @param array
     * @param i
     * @param j
     * @return
     */
    private static int arrayValue(int[][] array, int i, int j) {

        if (i < 0 || j < 0) {
            return 0;
        }
        if (i >= array.length || j >= array[i].length) {
            return 0;
        }
        return array[i][j];
    }

    /**
     * Функция для получения количества блоков в айсберге по координатам.
     *
     * @param array
     * @param x
     * @param y
     * @return
     */

    public static int volume(int[][] array, int x, int y) {

        if (arrayValue(array, x, y) != 1) {
            return 0;
        }

        array[x][y] = 0;

        return 1 + volume(array, x, y + 1) + volume(array, x, y - 1) + volume(array, x + 1, y) + volume(array, x - 1, y);
    }

    /**
     * Функция, что считает количество айсбергов и сколько они занимаю квадратов
     *
     * @param array
     * @return
     */

    static Hashtable<Integer, Integer> GetConnectedComponentsVolume(int[][] array) {

        Hashtable<Integer, Integer> result = new Hashtable<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int volume = volume(array, i, j);
                if (volume > 0) {
                    result.put(volume, result.getOrDefault(volume, 0) + 1);
                }
            }
        }
        return result;
    }
}
