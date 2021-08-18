package masliuk;

import com.nixsolution.masliuk.worker.Calculator;
import com.nixsolution.masliuk.worker.IMath;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


public class Runner {
    private static final Logger LOG = LogManager.getLogger(Main.class);
    static Scanner scanner = new Scanner(System.in);

    /**
     * Меню приложения.
     */
    public void menu() {

        int choice3 = 2;
        while (choice3 == 2) {
            LOG.info("Виберіть тип операції: ");
            LOG.info("1 - стандартна");
            LOG.info("3 - Exit");
            int choice1 = scanner.nextInt();
            for (int choice2 = 1; choice2 == 1; choice2 = scanner.nextInt()) {

                if (choice1 == 1) {
                    int operation = getOperationOrdinaryCalk();
                    double result = ordinaryCalc(operation);
                    LOG.info("Результат операции: " + result);
                }
                LOG.info("Щоб повторити операцію, натисніть 1");
                LOG.info("Щоб повернутися до початкового меню, натисніть 2");
            }
        }
    }

    /**
     * Сканирование числа;
     *
     * @return num - веденное чило
     */
    public double getDouble() {

        LOG.info("Ведіть число:");
        Double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            LOG.info("Ви допустили помилку, спробуйте ще");
            scanner.next();
            num = getDouble();
        }
        return num;

    }

    /**
     * Функция выбора операции.
     *
     * @return operation - вид операции.
     */
    public int getOperationOrdinaryCalk() {
        LOG.info("Введите операцию:");
        LOG.info("1 - додавання");
        LOG.info("2 - віднімання");
        LOG.info("3 - множення");
        LOG.info("4 - ділення");
        int operation;
        if (scanner.hasNextInt()) {
            operation = scanner.nextInt();
        } else {
            LOG.info("Ви допустили помилку. Спробуйте ще раз.");
            scanner.next();
            operation = getOperationOrdinaryCalk();
        }
        return operation;
    }

    /**
     * Функция обрабатывает числа и выводит результат.
     *
     * @param operation - номер операции.
     * @return result - результат операции
     */
    public double ordinaryCalc(int operation) {

        IMath proxy = new Calculator();

        double number1 = getDouble();
        double number2 = getDouble();

        double result;

        switch (operation) {
            case 1:
                result = proxy.add(number1, number2);
                break;
            case 2:
                result = proxy.sub(number1, number2);
                break;
            case 3:
                result = proxy.mul(number1, number2);
                break;
            case 4:
                result = proxy.div(number1, number2);
                break;
            default:
                LOG.info("Операція не виконана. Повторіть дію.");
                result = ordinaryCalc(getOperationOrdinaryCalk());
        }
        return result;
    }


}
