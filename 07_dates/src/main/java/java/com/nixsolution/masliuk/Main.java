package java.com.nixsolution.masliuk;




import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static java.com.nixsolution.masliuk.DateJava7.isFridays13Java7;
import static java.com.nixsolution.masliuk.DateJava8.isFridays13Java8;


public class Main {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(Main.class.getName());


    public static void main(String[] args) {

        //java7
        Calendar calendar = new GregorianCalendar(2019, 11, 13);
        Date date13 = calendar.getTime();
        LOGGER.info(String.valueOf(isFridays13Java7(date13)));

        Calendar calendar1 = new GregorianCalendar(2019, 9, 18);
        Date date1 = calendar1.getTime();
        Calendar calendar2 = new GregorianCalendar(2015, 9, 29);
        Date date2 = calendar2.getTime();
        LOGGER.info(DateJava7.between(date1, date2));


        //java 8
        LocalDate localDate13 = LocalDate.of(2019, 9, 13);
        LOGGER.info(String.valueOf(isFridays13Java8(localDate13)));

        LocalDate localDate1 = LocalDate.of(2019, 9, 18);
        LOGGER.info(String.valueOf(isFridays13Java8(localDate13)));
        LocalDate localDate2 = LocalDate.of(2021, 9, 29);
        LOGGER.info(DateJava8.between(localDate1, localDate2));


    }
}
