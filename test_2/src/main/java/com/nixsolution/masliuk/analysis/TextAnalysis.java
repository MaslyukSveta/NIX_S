package com.nixsolution.masliuk.analysis;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.nixsolution.masliuk.analysis.Months.definitionOfMonths;

/**
 * TextAnalysis класс анализирует текст, а именно ищет год, месяц, день.
 *
 * @author Svitlana Masliuk
 * @version 1.0
 */
public class TextAnalysis {
    /**
     * Функция ищет год в тексте.
     *
     * @param string строка текста.
     * @return год
     */
    public String searchYear(String string) {

        String regex = " (\\d{4}) ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        String year;
        if (matcher.find()) {
            year = matcher.group();
            return year.replaceAll("\\s+", "");
        }
        return "";
    }

    /**
     * Функция ищет день в строке.
     *
     * @param string строка текста.
     * @return число
     */
    public String searchDay(String string) {

        String regex = " (\\d{1,2}) ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            String day = matcher.group();
            return day.replaceAll("\\s+", "");
        }
        return "";
    }

    /**
     * Функция ищет месяц в строке.
     *
     * @param string строка текста
     * @return номер месяца
     */
    public int searchMonth(String string) {

        String regex = "([а-яА-Яa-zA-Z]{3,10})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        int day = 0;
        while (matcher.find()) {
            if (Months.definitionOfMonths(matcher.group()) > 0) {
                day = day + definitionOfMonths(matcher.group());
                return day;
            }
        }

        return Integer.parseInt(null);
    }



}
