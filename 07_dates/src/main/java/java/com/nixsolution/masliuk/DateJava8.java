package java.com.nixsolution.masliuk;


import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Класс для наследования интерфейса с датами
 *
 * @version 1.0
 * @autor Маслюк Светлана
 */

public class DateJava8 {
    private final static Logger logger = Logger.getLogger(DateJava8.class.getName());

    /**
     * Метод проверяет является ли указанная дата пятницей 13-го.
     *
     * @param date дата
     * @return true если указанная дата является пятницей 13-го, иначе - false.
     */
    public static boolean isFridays13Java8(LocalDate date) {
        return "FRIDAY".equals(date.getDayOfWeek().toString())
                && date.getDayOfMonth() == 13;
    }


    /**
     * Метод возвращает строковое значение периода между датами в формате "[A years] [B months] [C days]"
     * (скобки показывают опциональность части и не должны отображаться в результирующей строке).
     * множественное и единичное число должно правильно обрабатываться.
     * Примеры результата:
     * 2 days
     * 5 years 1 day
     * 1 year 2 months 19 days
     *
     * @param date1 начальная дата
     * @param date2 конечная дата
     * @return строковое значение периода между датами
     */

    public static String between(LocalDate date1, LocalDate date2) {
        String date = new String();
        Period diff = Period.between(date1, date2);

        if (diff.getYears() > 0) {
            date += diff.getYears() + "  years ";
        }
        if (diff.getMonths() > 0) {
            date += diff.getMonths() + "  months ";
        }
        if (diff.getDays() > 0) {
            date += diff.getDays() + " days ";
        }
        return date;
    }

    /**
     * Метод возвращает массив дат которые выподают на понедельник в указанном годе и месяце.
     *
     * @param instant текущая дата
     * @return массив дат где каждая дата является понедельником.
     */
    public LocalDate[] mondays(Instant instant) {

        YearMonth month = YearMonth.of(2017, 1);
        LocalDate start = month.atDay(1).with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        int countMonday = (int) ChronoUnit.WEEKS.between(start, month.atEndOfMonth()) + 1;
        logger.log(Level.INFO, String.valueOf(countMonday));

        return new LocalDate[0];

    }


    /**
     * Метод проверяет является ли указанная дата пятницей 13-го.
     *
     * @param date дата
     * @return true если указанная дата является пятницей 13-го, иначе - false.
     */
    public boolean isFridays13(LocalDate date) {

        return "FRIDAY".equals(date.getDayOfWeek().toString()) && date.getDayOfMonth() == 13;
    }

    /**
     * Метод конвертирует дату в строку используя полный формат и локаль для указанного языка
     *
     * @param date     дата
     * @param language двухбуквенный или трехбуквенный код языка соответсвующий ISO 639
     * @return строка, содержащая форматированную дату
     */
    public String formatFullJava8(ZonedDateTime date, String language) {

        LocalDateTime localDateTime = LocalDateTime.now();

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("UTC"));

        return String.valueOf(zonedDateTime);
    }
}
