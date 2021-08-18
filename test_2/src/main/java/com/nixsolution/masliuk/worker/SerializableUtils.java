package com.nixsolution.masliuk.worker;


import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * SerializableUtils - класс имеет методы сериализации и десиарилации
 *
 * @author Svitlana Masliuk
 * @version 1.0
 */
public class SerializableUtils implements com.nixsolutions.ppp.serializable.SerializableUtils {

    private static final Logger LOG = LogManager.getLogManager().getLogger(String.valueOf(SerializableUtils.class));

    /**
     * Сериализация объекта.
     *
     * @param out поток в который записываем объект
     * @param obj сериализируемый объект
     * @throws NullPointerException если out или obj == null
     * @throws RuntimeException в случае различных ошибок, как cause должна быть прикреплены
     * причина
     */

    @Override
    public void serialize(OutputStream out, Object obj) {

        try {
            if(out == null ||obj == null) {
                throw new NullPointerException();
            }
            else {
                new ObjectOutputStream(out).writeObject(obj);
            }

        } catch (IOException | RuntimeException exception) {
            LOG.info(exception.getMessage());
        }

    }



    /**
     * Восстановление объекта.
     *
     * @param in поток из которогу нужно прочитать и востановить объект
     * @param clazz класс объекта который нужно прочитать и востановить
     * @return востановленный объект
     * @throws NullPointerException если in == null
     * @throws RuntimeException в случае различных ошибок, как cause должна быть прикреплены
     * причина
     */
    @Override
    public <T> T deserialize(InputStream in, Class<T> clazz) {
        Object object = new Object();
        try {
            if (in == null) {
                throw new NullPointerException();
            }
            else {
                object = new ObjectInputStream(in).readObject();
            }

        } catch (RuntimeException | ClassNotFoundException | IOException exception) {
            LOG.info(String.valueOf(exception.getCause()));
        }
        return (T) object;
    }
}
