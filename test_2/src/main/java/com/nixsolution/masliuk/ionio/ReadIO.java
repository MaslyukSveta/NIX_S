package com.nixsolution.masliuk.ionio;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


/**
 * ReadIO класс считывает текст с файла технологией IO
 *
 * @author Svitlana Masliuk
 * @version 1.0
 */
public class ReadIO {

    /**
     * Функция считывания данных
     * @param fileName имя файла с которого происходит считывание данных
     * @return вывод считаных данных данные
     * @throws IllegalArgumentException
     */
    public String scanText(String fileName) throws IllegalArgumentException {
        /**
        List<String> myListScanner = new ArrayList<>();
        Scanner scanner = null;
        String patternString = " ";
        Pattern pattern = Pattern.compile(patternString);

        try {
            scanner = new Scanner(new BufferedReader(new FileReader(fileName)));
            while (scanner.hasNext()) {
                myListScanner.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */
        List<String> myList = new ArrayList<>();
        BufferedReader inputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = inputStream.readLine()) != null) {
                myList = new ArrayList<>(Arrays.asList(line.split(" ")));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

       // String s = myList.stream().map(e-> e.toString()).reduce(" ", String::concat);
        String s2 = myList.stream().map(Object::toString).collect(Collectors.joining(" "));
        return s2;
    }


}
