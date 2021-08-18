package com.nixsolution.masliuk.worker;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * DateUtils класс имеет методы которые считают количество дней в месяце (Java7, Java8)
 *
 * @author Svitlana Masliuk
 * @version 1.0
 */
public class DateUtils {

    /**
     * Метод возвращвет количетво дней в месяце (Java7)
     * @param date дата
     * @return
     */
    public int countDayInMonthInYearJava7_1(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }


    /**
     * Метод возвращает количетво дней в месяце форматируя String в Date
     * @param stringDate строковая дата
     * @return количество дней в месяце (Java7)
     */
    public int countDayInMonthInYearJava7_2(String stringDate) {
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date nDate1 = date.parse(stringDate);
            return (countDayInMonthInYearJava7_1(nDate1));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return 0;
    }

    /**
     * Функция создает строку, лдя подальшего форматирования
     * @param year - год
     * @param month - месяц
     * @param day - день
     * @return строка правильного формата
     */
    public String createString(int year, int month, int day) {

        month += 1;
        String days = String.valueOf(day);
        String months = String.valueOf(month);

        return ("00" + days).substring(days.length()) + "/" + ("00" + month).substring(months.length()) + "/" + year;
    }


    /**
     * Метод возращает кличество дней в месяце (Java8)
     * @param year - год
     * @param month - месяц
     * @return количество дней в месяце
     */
    public int countDayInMonthInYearJava8(int year, int month) {
        month += 1; // потому, что поиск месяца с помошью java.util.Calendar.* итерация начинается с 0;
        YearMonth yearMonthObject = YearMonth.of(year, month);
        return yearMonthObject.lengthOfMonth();
    }


    /**
     * Метод возвращает колличество дней в месяце (Java7)
     * @param year - год
     * @param month - месяц
     * @param day - день
     * @return количество дней в месяце
     */
     public int countDayInMonthInYearJava7_3(int year, int month, int day) {

     Calendar myCalc = new GregorianCalendar(year, month, day);

     return myCalc.getActualMaximum(Calendar.DAY_OF_MONTH);
     }



}
