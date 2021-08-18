package com.nixsolution.masliuk.worker_2;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.nixsolutions.ppp.serializable.SerializableUtils;

import java.io.InputStream;
import java.io.OutputStream;


/**
 * @author Masliuk Svitlana
 * @version 1.1
 */

public class SerializableUtilsImpl implements SerializableUtils {

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

        if (obj == null) {
            throw new NullPointerException();
        }
        try {
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.writeValue(out, obj);
        } catch (Exception e) {
            throw new RuntimeException(e.getCause());
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
        if (in == null) {
            throw new NullPointerException();
        }
        try {
            XmlMapper xmlMapper = new XmlMapper();
            return xmlMapper.readValue(in, clazz);
        } catch (Exception e) {
            throw new RuntimeException(e.getCause());
        }
    }
}
