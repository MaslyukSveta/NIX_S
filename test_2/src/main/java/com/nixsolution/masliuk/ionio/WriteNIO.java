package com.nixsolution.masliuk.ionio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * WriteNIO записывает в файл текст технологией NIO
 *
 * @author Svitlana Masliuk
 * @version 1.0
 */
public class WriteNIO {

    /**
     * Функция для записи текста в фаил.
     *
     * @param string текст для записи
     * @param nameFile имя файла в который записуют текст
     */
    public void writeNIO(String string, String nameFile) {

        Path path = Paths.get(nameFile);
        try(BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-8"))){
            writer.write(string);
        }catch(IOException ex){
            ex.printStackTrace();
        }

    }
}
