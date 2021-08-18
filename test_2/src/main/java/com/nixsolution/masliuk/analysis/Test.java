package com.nixsolution.masliuk.analysis;

import com.nixsolution.masliuk.ionio.ReadIO;
import com.nixsolution.masliuk.ionio.WriteNIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(Test.class.getName());

    public static void main(String [] args) {


        String stringMonth = "may";

        LOGGER.info("номер месяца иттерация с 0");
        LOGGER.info(String.valueOf(Months.definitionOfMonths(stringMonth)));

        String string1 = "Я любил 1999 год, а особенно may, который состоял из 28 дней";
        String string2 = "Я любила 2019 год, а особенно Сентябрь, который состоял из 30 дней";

        TextAnalysis textAnalysis = new TextAnalysis();

        LOGGER.info("поиск года в тексте");
        LOGGER.info(textAnalysis.searchYear(string1));
        LOGGER.info(textAnalysis.searchYear(string2));

        LOGGER.info("поиск месяца в тексте иттерация с 0");
        LOGGER.info(String.valueOf(textAnalysis.searchMonth(string1)));
        LOGGER.info(String.valueOf(textAnalysis.searchMonth(string2)));

        LOGGER.info("поиск числа в тексте");
        LOGGER.info(textAnalysis.searchDay(string1));
        LOGGER.info(textAnalysis.searchDay(string2));


        ReadIO readIO = new ReadIO();
        LOGGER.info(readIO.scanText("intest.txt"));




    }
}
