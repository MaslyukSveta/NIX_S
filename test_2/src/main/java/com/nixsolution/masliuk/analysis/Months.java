package com.nixsolution.masliuk.analysis;

import static java.util.Calendar.*;

/**
 * Month который всегда возвращает значение месяца
 *
 * @author Svitlana Masliuk
 * @version 1.0
 */
public class Months {

    /**
     * Функция выводит номер месяца
     *
     * @param stringMonth название месяца
     * @return номер месяца
     */
    public static int definitionOfMonths(String stringMonth) {

        switch (stringMonth) {
            case "январь":
            case "Январь":
            case "january":
            case "January":
                return JANUARY;
            case "февраль":
            case "Февраль":
            case "february":
            case "February":
                return FEBRUARY;
            case "март":
            case "Март":
            case "march":
            case "March":
                return MARCH;
            case "апрель":
            case "Апрель":
            case "april":
            case "April":
                return APRIL;
            case "май":
            case "Май":
            case "may":
            case "May":
                return MAY;
            case "июнь":
            case "Июнь":
            case "june":
            case "June":
                return JUNE;
            case "июль":
            case "Июль":
            case "july":
            case "July":
                return JULY;
            case "август":
            case "Август":
            case "august":
            case "August":
                return AUGUST;
            case "сентябрь":
            case "Сентябрь":
            case "september":
            case "September":
                return SEPTEMBER;
            case "октябрь":
            case "Октябрь":
            case "october":
            case "October":
                return OCTOBER;
            case "ноябрь":
            case "Ноябрь":
            case "november":
            case "November":
                return NOVEMBER;
            case "декабрь":
            case "Декабрь":
            case "december":
            case "December":
                return DECEMBER;
        }

        return 0;
    }

}
