package masliuk;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {

    // Функция для проверки IP-адреса.
    public static boolean isValidIPAddress(String ip) {

        //Регулярное выражение для цифр от 0 до 255.
        String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";

        // Регулярное выражение для цифр от 0 до 255 и
        // затем точка, повторить 4 раза.
        // это регулярное выражение для проверки IP-адреса.
        String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

        // Компилируем ReGex
        Pattern p = Pattern.compile(regex);

        // Если IP-адрес пустой
        // возвращаем false
        if (ip == null) {
            return false;
        }
        // Класс шаблона содержит метод matcher()
        // найти соответствие между заданным IP-адресом
        // и регулярное выражение.

        Matcher m = p.matcher(ip);

        // Вернемся, если IP-адрес
        // соответствует ReGex
        return m.matches();
    }
    /**
    Функция преобразует CamelCase строку в словосочетания в нижнем регистре Исключением служит первая буква. Её регистр нужно оставить нетронутым Пример: "HelloJavaWorld" -> "Hello java world"
    Params:
    camelStr – CamelCase строка
    Returns:
    обычная строка или пустая строка если передан null или пустая строка
     *
     * @return*/
    public static String fromCamelCase(String camelStr){
        Pattern pattern = Pattern.compile("\\d + \\s");
        String[] words = pattern.split(camelStr);


        return Arrays.toString(words);
    }




}
