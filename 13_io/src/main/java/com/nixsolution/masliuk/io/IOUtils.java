package com.nixsolution.masliuk.io;

import java.io.File;


/**
 * Утилиты с использование стандартного ввода вывода io.
 *
 * @author yura
 *
 */
public interface IOUtils {
    /**
     * Функция сжимает {@code fileName} и ложит результат с расширением ".gzip"
     * в директорию {@code folder}, для сжатия потока используется
     * {@link java.util.zip.GZIPOutputStream GZIPOutputStream}
     *
     * @param fileName
     *            путь к файлу
     * @param folder
     *            директория для сохранения сжатого файла
     * @return полный путь к новому файлу, включая имя файла.
     * @throws IllegalArgumentException
     *             если {@code fileName} не возможно создать или {@code folder}
     *             не существует
     */
    String gzip(String fileName, String folder) throws IllegalArgumentException;

    /**
     * Функция ищет в текстовом {@code fileName} все вхождения {@code mark} и
     * возвращает количество строк, в которых встречается {@code mark}.
     *
     * @param fileName
     *            путь к файлу
     * @param mark
     *            текст для поиска
     * @return количество строк, в которых встречается {@code mark}.
     * @throws IllegalArgumentException
     *             если {@code file} не существует
     */
    Integer searchText(String fileName, String mark)
            throws IllegalArgumentException;

    /**
     * Функция ищет все файлы с расширением {@code ext} в {@code folder}
     * директории и поддиректориях и возвращает их полные пути в виде массива
     * строк. В случае если extention == null считаем что это пустая строка и
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
    String[] search(File folder, String ext) throws IllegalArgumentException;
}