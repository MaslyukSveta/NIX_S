package com.nixsolution.masliuk.worker_2;

import com.nixsolutions.ppp.serializable.SerializableBean;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Bean с возможностью управления сериализацией.
 * сериализация должна происходить по следующим правилам
 * все поля объекта объединяются в строку
 * "name;email;zip" <br>
 * а затем уже строка сериализируется в поток
 *
 * @author Masliuk Svitlana
 * @version 1.1
 */


public class SerializableBeanImpl implements SerializableBean {

    private String name;
    private String email;
    private int zip;

    /**
     * <p>Без конструктора по умолчанию будет вылазить ошибка InvalidClassException</p>
     */
    public SerializableBeanImpl() {

    }


    public SerializableBeanImpl(String name, String email, int zip) {
        this.name = name;
        this.email = email;
        this.zip = zip;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int getZip() {
        return zip;
    }

    @Override
    public void setZip(int zip) {
        this.zip = zip;
    }


    /**
     * Объект реализует метод writeExternal для сохранения своего содержимого.
     *       * вызывая методы DataOutput для его примитивных значений или
     *       * вызов метода writeObject из ObjectOutput для объектов, строк,
     *       * и массивы.
     *       *
     *       * @param из потока для записи объекта в
     *       * @throws IOException Включает любые исключения ввода-вывода, которые могут возникнуть
     *       * Методы переопределения @serialData должны использовать этот тег для описания
     *       * макет данных этого объекта Externalizable.
     *       * Перечислите последовательность типов элементов и, если возможно,
     *       * связать элемент с общедоступным / защищенным полем и / или
     *       * метод этого класса Externalizable.
     */
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeBytes(createOneString());

    }


    /**
     * <p>Метод собирает значения полей в одну строку</p>
     *
     * @return Одна строка со значениями полей класса
     */
    private String createOneString() {
        return "\"" + getName() + ";" + getEmail() + ";" + getZip() + "\"";

    }

    /**
     * * Объект реализует метод readExternal для восстановления своего
     *       * содержимое путем вызова методов DataInput для примитива
     *       * типы и readObject для объектов, строк и массивов. В
     *       * метод readExternal должен читать значения в той же последовательности
     *       * и с теми же типами, которые были написаны writeExternal.
     *       *
     *       * @param в потоке для чтения данных с целью восстановления объекта
     *       * @ генерирует исключение IOException при возникновении ошибок ввода-вывода
     *       * @throws ClassNotFoundException Если класс объекта
     *       * восстановлено не может быть найдено.

     */

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        String items;
        try {
            items = (String) in.readObject();
        } catch (IOException e) {
            throw new IOException(e.getCause());
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundException(e.getMessage());
        }
        name = findItem(items, Pattern.compile("(?<=\\\")\\w+"));
        email = findItem(items, Pattern.compile("(?<=;)[\\w]+(?=;)"));
        zip = Integer.parseInt(findItem(items, Pattern.compile("(?<=;)[\\d]+(?=\")")));

    }

    /**
     * <p>Метод ищет по заданому паттерну нужные элементы в строке</p>
     *
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
