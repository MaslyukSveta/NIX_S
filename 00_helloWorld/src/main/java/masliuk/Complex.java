package masliuk;

public class Complex {

    final int NUMBER_1 = 17;
    final int NUMBER_2 = 31;
    private final double realPart;
    private final double imaginaryPart;

    public Complex(double realPart, double imaginaryPart) {
        if (Double.isNaN(realPart) || Double.isNaN(imaginaryPart)) {
            throw new ArithmeticException();
        }
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double realPart() {
        return realPart;
    }

    public double imaginaryPart() {
        return imaginaryPart;
    }

    public Complex add(Complex complex) {
        return new Complex(realPart + complex.realPart, imaginaryPart + complex.imaginaryPart);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Complex)) {
            return false;
        }
        Complex c = (Complex) object;
        return Double.compare(realPart, c.realPart) == 0 && Double.compare(imaginaryPart, c.imaginaryPart) == 0;
    }

    @Override
    public int hashCode() {
        int result = NUMBER_1 + Double.hashCode(realPart);
        result = NUMBER_2 * result + Double.hashCode(imaginaryPart);
        return result;
    }

    @Override
    public String toString() {
        return "(" + realPart + ((imaginaryPart < 0) ? "" : "+") + imaginaryPart + "i)";
    }

    public static void main(String[] args) {

        final int FIRST_NUMBER = 1;
        final int SECOND_NUMBER = 2;

        Complex z = new Complex(FIRST_NUMBER, SECOND_NUMBER);
        System.out.println(z.add(z));
    }

}
