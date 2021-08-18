package com.nixsolution.masliuk.io;

import java.nio.file.Path;


/**
 * Утилиты с использование неблокирующего ввода вывода nio.
 *
 * @author yura
 *
 */
public interface NIOUtils {
    /**
     * Функция ищет текст в файле, согласно следующим правилам. В файле
     * расположен текст и числа типа Integer(положительные и отрицательные)
     * разделитель пробел. Между разделителями не более 10 байт.<br>
     * Если функция считывает число N, она должна начать следующее считываение
     * через N байт, относительно текущей позиции. Для положительных чисел
     * позицию прибавляем, для отрицательных вычитаем. Если функция после
     * очередного числа считывает текст, то она возвращает это значение. Пример:
     * <br>
     * Содержимое файла: <br>
     * 1 7 -2 a -2 <br>
     * searchText(path, 4) вернет "а"<br>
     *
     * @param file
     *            путь к файлу
     * @param offset
     *            начальный сдвиг в файле
     * @return найденный в файле текст.
     * @throws IllegalArgumentException
     *             если {@code file} не существует
     */
    String searchText(Path file, int offset) throws IllegalArgumentException;

    /**
     * Функция ищет все файлы с расширением {@code ext} в {@code folder}
     * директории и поддиректориях и возвращает их полные пути в виде массива
     * строк. В случае если extention == null, считаем что это пустая строка и
     * ищем все файлы.
     *
     * @param folder
     *            корневая директория для поиска
     * @param ext
     *            расширение файла
     * @return список найденных файлов с абсолютными путями.
     * @throws IllegalArgumentException
     *             если {@code folder} не существует
     *
     */
    String[] search(Path folder, String ext) throws IllegalArgumentException;
}
