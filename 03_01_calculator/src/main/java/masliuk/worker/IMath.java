package masliuk.worker;

public interface IMath {

    /**
     * The method calculates the sum of the numbers.
     *
     * @param number1 first number.
     * @param number2 second number
     * @return sum of numbers.
     */
    double add(double number1, double number2);

    /**
     * The method calculates the subtraction of the numbers.
     *
     * @param number1 first number.
     * @param number2 second number.
     * @return subtraction of number.
     */
    double sub(double number1, double number2);

    /**
     * The method calculates the multiplication of the numbers.
     *
     * @param number1 first number.
     * @param number2 second number.
     * @return multiplication of number.
     */
    double mul(double number1, double number2);

    /**
     * The method calculates the division of the numbers.
     *
     * @param number1 first number.
     * @param number2 second number.
     * @return division of number.
     */
    double div(double number1, double number2);
}
