package masliuk.worker;

public class Calculator implements IMath {


    /**
     * The method calculates the subtraction of the numbers.
     *
     * @param number1 first number.
     * @param number2 second number.
     * @return subtraction of number.
     */
    @Override
    public double sub(double number1, double number2) {

        return (number1 - number2);
    }

    /**
     * The method calculates the multiplication of the numbers.
     *
     * @param number1 first number.
     * @param number2 second number.
     * @return multiplication of number.
     */
    @Override
    public double mul(double number1, double number2) {

        return (number1 * number2);
    }

    /**
     * The method calculates the division of the numbers.
     *
     * @param number1 first number.
     * @param number2 second number.
     * @return division of number.
     */
    @Override
    public double div(double number1, double number2) {

        return (number1 / number2);
    }

    /**
     * The method calculates the sum of the numbers.
     *
     * @param number1 first number.
     * @param number2 second number
     * @return sum of numbers.
     */
    @Override
    public double add(double number1, double number2) {
        return (number1 + number2);
    }
}
