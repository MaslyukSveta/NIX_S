package masliuk;

public class Calculator {

    /**
     * The method calculates the sum of the numbers.
     *
     * @param number1 first number.
     * @param number2 second number
     * @return sum of numbers.
     */
    public int sum(int number1, int number2) {

        return number1 + number2;
    }

    /**
     * The method calculates the subtraction of the numbers.
     *
     * @param number1 first number.
     * @param number2 second number.
     * @return subtraction of number.
     */
    public int sub(int number1, int number2) {

        return number1 - number2;
    }

    /**
     * The method calculates the division of the numbers.
     *
     * @param number1 first number.
     * @param number2 second number.
     * @return division of number.
     */
    public double div(int number1, int number2) {

        return (double) number1 / number2;
    }

    /**
     * The method calculates the multiplication of the numbers.
     *
     * @param number1 first number.
     * @param number2 second number.
     * @return multiplication of number.
     */
    public int mul(int number1, int number2) {

        return number1 * number2;
    }

}

