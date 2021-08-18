package com.nixsolution.masliuk;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * клас
 */

public class Main {
    public static void main(String [] args) throws ParseException {


        /**
         * Вы создаете файл с данными вручную (в процессе устного ответа я могу поменять данные (все данные на английском языке),
         * программа не меняется в процессе устного ответа).
         * Считать данные из файла технологией IO.
         * Обработать  данные, выделив нужные для задачи части (например, в строке встречается день недели, год и месяц,
         * дата в разных комбинациях в строке «Я любил 1999 год, а особенно февраль, который состоял из 29 дней»).
         * Вычислить количество дней в месяце в указанном году и проверить правильность из строки (Java 7-).
         * Вычислить количество дней в месяце в указанном году и проверить правильность из строки (Java 8+).
         * Записать данные в файл технологией NIO.
         * Подготовить программу для JavaDoc.
         * Покрыть проект тестами.
         */

        IO io = new IO();
        System.out.println(io.searchText("intest.txt"));

        String fromDate = "2009/05/19";
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        java.util.Date dtt = df.parse(fromDate);
        System.out.println(fromDate);

        System.out.println(io.daysInMonth7("2002--05--1"));



    }
}
