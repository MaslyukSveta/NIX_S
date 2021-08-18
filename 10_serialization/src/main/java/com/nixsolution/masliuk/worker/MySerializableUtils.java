package com.nixsolution.masliuk.worker;

import com.nixsolutions.ppp.serializable.SerializableUtils;

import java.io.*;
import java.lang.reflect.Field;
import java.util.Calendar;

public class MySerializableUtils implements SerializableUtils {


    /**
     * Сериализация объекта.
     * Throws:
     * NullPointerException – если out или obj == null
     * RuntimeException – в случае различных ошибок, как cause должна быть прикреплены причина
     * @param out - поток в который записываем объект
     * @param obj – сериализируемый объект
     */
    @Override
    public void serialize(OutputStream out, Object obj) {

        String filename = "informationFile.ser";

        MySerializableBean bean = new MySerializableBean();

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(filename);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(bean);
            objectOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Like deserialize but leaves the supplied stream open.
     * @param in
     * @return
     * @throws IOException
     */
    @Override
    public <T> T deserialize(InputStream in, Class<T> clazz) {

        MySerializableBean obj = null;
        try {
            ObjectInputStream oin = new ObjectInputStream(in);
            obj = (MySerializableBean) oin.readObject();
            return clazz.cast(obj);
        } catch (IOException | ClassNotFoundException ioException) {
            ioException.printStackTrace();
        }
        return (T) (obj.getEmail() + obj.getEmail() + obj.getZip());
    }
}
