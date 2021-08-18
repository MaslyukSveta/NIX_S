package com.nixsolution.masliuk.worker;

import com.nixsolution.masliuk.interfaces.DateI;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * MyDate с возможностью управления сериализацией.
 * сериализация должна происходить по следующим правилам
 * все поля объекта объединяются в строку "28/02/1999"
 * а затем уже строка сериализируется в поток
 *
 * Класс MyDate - класс который содержит поля оброботку и дальнейшей серилизации
 * @author Svitlana Masliuk
 * @version 1.0
 */
public class MyDate implements DateI {

    /**Поле года*/
    private String year;
    /**Поле месяца*/
    private int month;
    /**Поле дня*/
    private String day;

    /**
     * Пустой конструктор класса
     */
    public MyDate(){}

    /**
     * Конструктор класса
     * @param year - год
     * @param month - месяц
     * @param day - число
     */
    public MyDate(String year, int month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


    @Override
    public String getYear() {
        return year;
    }
    @Override
    public void setYear(String year) {
        this.year = year;
    }
    @Override
    public int getMonth() {
        return month;
    }

    @Override
    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String getDay() {
        return day;
    }

    @Override
    public void setDay(String day) {
        this.day = day;
    }


    /**
     * Объект реализует метод writeExternal для сохранения своего содержимого.
     * вызывая методы DataOutput для его примитивных значений или
     * вызов метода writeObject из ObjectOutput для объектов, строк,
     * и массивы.
     * @param out из потока для записи объекта в
     * @throws IOException Включает любые исключения ввода-вывода, которые могут возникнуть
     * Методы переопределения @serialData должны использовать этот тег для описания
     * макет данных этого объекта Externalizable.
     * Перечислите последовательность типов элементов и, если возможно,
     * связать элемент с общедоступным / защищенным полем и / или
     * метод этого класса Externalizable.
     */
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeBytes(createOneString());

    }


    /**
     * <p>Метод собирает значения полей в одну строку</p>
     *
     * @return Одна строка со значениями полей класса
     */
    public String createOneString() {
        return "\"" + year + "/" + month + "/" + day + "\"";

    }

    /**
     * * Объект реализует метод readExternal для восстановления своего
     * содержимое путем вызова методов DataInput для примитива
     * типы и readObject для объектов, строк и массивов. В
     * метод readExternal должен читать значения в той же последовательности
     * и с теми же типами, которые были написаны writeExternal.
     * @param in в потоке для чтения данных с целью восстановления объекта
     *  @ генерирует исключение IOException при возникновении ошибок ввода-вывода
     *  @throws ClassNotFoundException Если класс объекта
     * восстановлено не может быть найдено.
     */

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        String items;
        try {
            items = (String) in.readObject();
        } catch (IOException e) {
            throw new IOException(e.getCause());
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundException(e.getMessage());
        }
        year = findItem(items, Pattern.compile("(?<=\\\")\\w+"));
        month = Integer.parseInt(findItem(items, Pattern.compile("(?<=/)[\\w]+(?=/)")));
        day = findItem(items, Pattern.compile("(?<=/)[\\d]+(?=\")"));

    }

    /**
     * <p>
     *     Метод ищет по заданому паттерну нужные элементы в строке
     * </p>
     * @param str Строка для поиска
     * @param pattern Паттерн по которому ищут нужный элемент
     * @return Найденный элемент или пустая строка, если элемент не был найден
     */
    private String findItem(String str, Pattern pattern) {

        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        } else {
            return "";
        }
    }



}
