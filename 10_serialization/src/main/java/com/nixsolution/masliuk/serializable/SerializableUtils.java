package com.nixsolution.masliuk.serializable;


import java.io.InputStream;
import java.io.OutputStream;

/**
 * Утилиты сериализации объектов.
 *
 * @author yura
 *
 */
public interface SerializableUtils {
    /**
     * Сериализация объекта.
     *
     * @param out
     *            поток в который записываем объект
     * @param obj
     *            сериализируемый объект
     *
     * @throws NullPointerException
     *             если out или obj == null
     * @throws RuntimeException
     *             в случае различных ошибок, как cause должна быть прикреплены
     *             причина
     */
    void serialize(OutputStream out, Object obj);

    /**
     * Восстановление объекта.
     *
     * @param in поток из которогу нужно прочитать и востановить объект
     * @param clazz класс объекта который нужно прочитать и востановить
     *
     * @return востановленный объект
     *
     * @throws NullPointerException
     *             если in == null
     * @throws RuntimeException
     *             в случае различных ошибок, как cause должна быть прикреплены
     *             причина
     */
    <T> T deserialize(InputStream in, Class<T> clazz);

}
