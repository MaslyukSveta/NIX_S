package com.nixsolution.masliuk.worker_2;

import com.nixsolutions.ppp.serializable.SingletonBean;

import java.io.ObjectStreamException;


/**
 * Bean который при десериализации всегда возвращает один и тоже объект
 *
 * @author Masliuk Svitlana
 * @version 1.1
 */


public class SingletonBeanImpl implements SingletonBean {

    public static final SerializableBeanImpl INSTANCE = new SerializableBeanImpl();

    private SingletonBeanImpl(){}

    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}
