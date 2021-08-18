package java.com.nixsolution.masliuk;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateJava7 {

    /**
     * Метод возвращает строковое значение периода между датами в формате "[A years] [B months] [C days]" (скобки
     * показывают опциональность части и не должны отображаться в результирующей строке). множественное и единичное число должно
     * правильно обрабатываться.
     * <p>
     * Примеры результата:
     * <ul>
     *  <li>2 days</li>
     *  <li>5 years 1 day</li>
     *  <li>1 year 2 months 19 days</li>
     * </ul>
     *
     * @param date1 начальная дата
     * @param date2 конечная дата
     * @return
     */
    public static String between(Date date1, Date date2) {

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        calendar1.setTime(date1);
        calendar2.setTime(date2);

        final int DAY_YEAR = 365;
        final int DAY_MONTHS = 30;

        int s1 = 0;
        int countLeapYear = 0;
        int countYear = 0;

        if (calendar1.get(Calendar.YEAR) == calendar2.get(Calendar.YEAR)) {
            s1 = Math.abs(calendar1.get(Calendar.DAY_OF_YEAR) - calendar2.get(Calendar.DAY_OF_YEAR));
        } else {
            if (calendar2.get(Calendar.YEAR) > calendar1.get(Calendar.YEAR)) {
                Calendar temp = calendar1;
                calendar1 = calendar2;
                calendar2 = temp;
            }
            int resultDays = 0;
            int dayOneOriginalYearDays = calendar1.get(Calendar.DAY_OF_YEAR);
            while (calendar1.get(Calendar.YEAR) > calendar2.get(Calendar.YEAR)) {
                calendar1.add(Calendar.YEAR, -1);
                resultDays += calendar1.getActualMaximum(Calendar.DAY_OF_YEAR);
            }
            s1 = resultDays - calendar2.get(Calendar.DAY_OF_YEAR) + dayOneOriginalYearDays;

        }

        if (calendar1.get(Calendar.YEAR) == calendar2.get(Calendar.YEAR)){
            if((calendar1.get(Calendar.YEAR)%400==0)||((calendar1.get(Calendar.YEAR)%4==0)&&(calendar1.get(Calendar.YEAR)%100!=0))) {
                countLeapYear += 1;
            } else {
                countYear = calendar2.get(Calendar.YEAR) - calendar1.get(Calendar.YEAR);
                while (countYear >= 1){
                    if(((calendar1.get(Calendar.YEAR)-countYear)%400==0)||(((calendar1.get(Calendar.YEAR)-countYear)%4==0)&&((calendar1.get(Calendar.YEAR)-countYear)%100!=0))){
                        countLeapYear += 1;
                    }
                    countYear -= 1;
                }
            }
        }

        int year = s1 / DAY_YEAR - countLeapYear;
        int months = (s1 - (year * DAY_YEAR + countLeapYear)) / DAY_MONTHS;
        int day = s1 - (year * DAY_YEAR + countLeapYear) - months * DAY_MONTHS;

        String date = new String();

        if(year > 0) {
            date += year + "  years ";
        }
        if(months > 0) {
            date += months + "  months ";
        }
        if(day > 0) {
            date += day + " days ";
        }
        return date;
    }

    /**
     * Метод вычисляет количество дней в каждом месяце в указанном годе.
     *
     * @param year
     * @return array where elements contain number of days for corresponding month in year.
     */
    public int[] daysInMonth(int year) {
        return new int[0];
    }

    /**
     * Метод возвращает массив дат которые выподают на понедельник в указанном годе и месяце.
     *
     * @param month месяц (от 0 до 11)
     * @param year  год
     * @return массив дат где каждая дата является понедельником.
     */
    public Date[] mondays(int month, int year) {

        Date [] dates = new Date[]{};
        Calendar calendar = Calendar.getInstance();
        return new Date[0];
    }

    /**
     * Метод проверяет является ли указанная дата пятницей 13-го.
     *
     * @param date дата
     * @return true если указанная дата является пятницей 13-го, иначе - false.
     */
    public static boolean isFridays13Java7(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_MONTH) == 13 && calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY;
    }

    /**
     * Метод конвертирует дату в строку используя полный формат и локаль для указанного языка.
     *
     * @param date     дата
     * @param language - двухбуквенный или трехбуквенный код языка соответсвующий ISO 639
     * @return
     */

    public String formatFull(Date date, String language) {
        final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTime());

    }
}
