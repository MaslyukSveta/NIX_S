package com.nixsolution.masliuk.worker;

import com.nixsolutions.ppp.serializable.SerializableBean;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Bean с возможностью управления сериализацией.
 * сериализация должна происходить по следующим правилам
 * все поля объекта объединяются в строку "name;email;zip"
 * а затем уже строка сериализируется в поток
 *  @author Masliuk Svitlana
 *  @version 1.0
 */
public class MySerializableBean implements SerializableBean {

    private String name;
    private String email;
    private int zip;
    private String string = this.getName() + ";" + this.getEmail() + ";" + this.getZip();


    public MySerializableBean() {

    }

    public MySerializableBean(String name, String email, int zip){
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



    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        out.writeObject(string);

        /**
        out.writeObject(this.getName());
        out.writeObject(this.getEmail());
        out.writeObject(this.getZip());
         */

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        string = (String) in.readObject();

        /**
        name = (String) in.readObject();
        email = (String) in.readObject();
        zip = (Integer) in.readObject();
         */

    }
}
