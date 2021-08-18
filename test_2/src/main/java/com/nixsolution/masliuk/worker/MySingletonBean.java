package com.nixsolution.masliuk.worker;

import com.nixsolutions.ppp.serializable.SingletonBean;

import java.io.ObjectStreamException;


/**
 * MySingletonBean - класс синглтон при десериализации всегда возврвщает один и тоже обьект
 *
 * @author Svitlana Masliuk
 * @version 1.0
 */


public class MySingletonBean implements SingletonBean {

    /**
     * Поле экземплара класса
     */
    public static final MyDate INSTANCE = new MyDate();

    private MySingletonBean(){}

    /**
     * <p>
     *    Метод, созданный для уравления экземпларом и реализации синглтона
     * </p>
     * @return INSTANCE - истенное значение обьекта MySingletonBean
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}
