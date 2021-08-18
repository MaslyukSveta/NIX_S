package com.nixsolution.masliuk.runner;

import com.nixsolution.masliuk.analysis.Test;
import com.nixsolution.masliuk.ionio.ReadIO;
import com.nixsolution.masliuk.ionio.WriteNIO;
import com.nixsolution.masliuk.analysis.Months;
import com.nixsolution.masliuk.analysis.TextAnalysis;
import com.nixsolution.masliuk.worker.DateUtils;
import com.nixsolution.masliuk.worker.MyDate;


/**
 * Вы создаете файл с данными вручную (в процессе устного ответа я могу поменять данные (все данные на английском языке),
 * программа не меняется в процессе устного ответа).
 * Считать данные из файла технологией IO.
 * Обработать  данные, выделив нужные для задачи части (например, в строке встречается день недели, год и месяц,
 * дата в разных комбинациях в строке
 * «Я любил 1999 год, а особенно февраль, который состоял из 29 дней»).
 * Вычислить количество дней в месяце в указанном году и проверить правильность из строки (Java 7-).
 * Вычислить количество дней в месяце в указанном году и проверить правильность из строки (Java 8+).
 * Записать данные в файл технологией NIO.
 * Подготовить программу для JavaDoc.
 * Покрыть проект тестами.
 * Технологии:
 * Exceptions
 * Collections
 * Generics
 * Streams
 * Lambda Expressions
 * Concurrency
 * Serializable
 * Annotations
 * Reflection
 */
public class Main {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(Test.class.getName());

    public static void main (String [] args) {

        ReadIO readIOr = new ReadIO();
        DateUtils dateUtils = new DateUtils();
        WriteNIO writeNIO = new WriteNIO();
        TextAnalysis textAnalysis = new TextAnalysis();


        String stringArray = (readIOr.scanText("D:\\Новый текстовый документ.txt"));


        int iYear = Integer.parseInt((textAnalysis.searchYear(stringArray)));
        int iMonth = textAnalysis.searchMonth(stringArray);
        int iDay = Integer.parseInt(textAnalysis.searchDay(stringArray));

        LOGGER.info(String.valueOf(dateUtils.countDayInMonthInYearJava8(iYear, iMonth)));


        String stringDate = dateUtils.createString(iYear, iMonth, iDay);

        LOGGER.info(String.valueOf(dateUtils.countDayInMonthInYearJava7_2(stringDate)));

        LOGGER.info(String.valueOf(dateUtils.countDayInMonthInYearJava7_3(iYear, iMonth, iDay)));


        LOGGER.info(stringArray);

        writeNIO.writeNIO(stringDate, "output.txt");

        LOGGER.info(stringDate);








    }
}
