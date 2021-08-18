package masliuk;

import masliuk.basetypes.BaseTypesUtil;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class BaseTypes implements BaseTypesUtil {

    @Override
    public String toggleScientificNotation(String str) {
        if(str == null){
            return null;
        }
        if(str.contains("E") || str.contains("e") || str.contains(".")) {
            return BigDecimal.valueOf(Double.parseDouble(str)).toPlainString();
        } else {
            return new DecimalFormat("0.0E0").format(Double.parseDouble(str));
        }
    }

    @Override
    public int[] sort(int[] array) {
        int [] arrayNew = new int [array.length];
        System.arraycopy(array, 0, arrayNew,0, array.length);
        Arrays.sort(arrayNew);
        return arrayNew;
    }

    @Override
    public float arithmeticMean(int[] array) {
        int sum = Arrays.stream(array).sum();
        return (float) sum/array.length;
    }


    @Override
    public String format(double number, String language) {

        Locale locale = new Locale(language);
        NumberFormat numberFormat = NumberFormat.getInstance(locale);

        return numberFormat.format(number);
    }

    @Override
    public String plus(String value1, String value2) {
        return (new BigDecimal(value1).add(new BigDecimal(value2))).toString();
    }

    @Override
    public String minus(String value1, String value2) {

        return (new BigDecimal(value1).subtract(new BigDecimal(value2))).toString();
    }

    @Override
    public String mul(String value1, String value2) {
        return (new BigDecimal(value1).multiply(new BigDecimal(value2))).toString();
    }


    @Override
    public String div(String value1, String value2) {
        BigDecimal bigDecimal1 = new BigDecimal(value1);
        BigDecimal bigDecimal2 = new BigDecimal(value2);
        BigDecimal result = bigDecimal1.divide(bigDecimal2);
        return result.toEngineeringString();
    }
}
