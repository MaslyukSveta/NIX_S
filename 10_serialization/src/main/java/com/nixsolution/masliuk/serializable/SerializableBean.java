package com.nixsolution.masliuk.serializable;

import java.io.Externalizable;

/**
 * Bean с возможностью управления сериализацией.
 * сериализация должна происходить по следующим правилам
 * все поля объекта объединяются в строку
 * "name;email;zip" <br>
 * а затем уже строка сериализируется в поток
 *
 * @author yura
 *
 */
public interface SerializableBean extends Externalizable {

    String getName();

    void setName(String name);

    String getEmail();

    void setEmail(String email);

    int getZip();

    void setZip(int zip);
}
