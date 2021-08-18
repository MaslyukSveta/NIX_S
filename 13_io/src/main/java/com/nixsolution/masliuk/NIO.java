package com.nixsolution.masliuk;

import com.nixsolution.masliuk.io.NIOUtils;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Path;

public class NIO implements NIOUtils, FilenameFilter {

    private String ext;

    public NIO() {

    }

    public NIO(String ext) {
        this.ext = ext.toLowerCase();
    }

    /**
     * Функция ищет текст в файле, согласно следующим правилам.
     * В файле расположен текст и числа типа Integer(положительные и отрицательные) разделитель пробел.
     * Между разделителями не более 10 байт.
     * Если функция считывает число N, она должна начать следующее считываение через N байт, относительно текущей позиции.
     * Для положительных чисел позицию прибавляем, для отрицательных вычитаем.
     * Если функция после очередного числа считывает текст, то она возвращает это значение.
     * <p>
     * Пример: Содержимое файла: 1 7 -2 a -2 searchText(path, 4) вернет "а"
     *
     * @param file   – путь к файлу
     * @param offset – начальный сдвиг в файле
     * @return найденный в файле текст.
     * @throws IllegalArgumentException – если file не существует
     */

    @Override
    public String searchText(Path file, int offset) throws IllegalArgumentException {
        return null;
    }

    /**
     * Функция ищет все файлы с расширением ext в folder директории и поддиректориях и возвращает их полные пути в виде массива строк.
     * В случае если extention == null, считаем что это пустая строка и ищем все файлы.
     *
     * @param folder – корневая директория для поиска
     * @param ext    – расширение файла
     * @return список найденных файлов с абсолютными путями.
     * @throws IllegalArgumentException – если folder не существует
     */

    @Override
    public String[] search(Path folder, String ext) throws IllegalArgumentException {


        String[] strings = new String[]{};
        try {
            File file = new File(String.valueOf(folder));

            if (!file.exists()) {
                throw new IllegalArgumentException("папки не существует");
            }

            File[] listFiles = file.listFiles(new NIO(ext));

            if (listFiles.length == 0) {
                throw new IllegalArgumentException("файлов с таким расширением нет");
            } else {

                for (File f : listFiles) {
                    strings[strings.length] = f.getAbsolutePath();

                }
            }
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }

        return (strings);
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.toLowerCase().endsWith(ext);
    }
}
