package masliuk;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        LOG.info("sum: " + calculator.sum(1, 2));
        LOG.info("subtraction: " + calculator.sub(5, 3));
        LOG.info("division: " + calculator.div(2, 3));
        LOG.info("multiplication: " + calculator.mul(12, 3));

    }
}
