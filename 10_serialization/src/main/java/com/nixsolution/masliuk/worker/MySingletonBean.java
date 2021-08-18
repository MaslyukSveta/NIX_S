package com.nixsolution.masliuk.worker;


import com.nixsolution.masliuk.serializable.SingletonBean;

public class MySingletonBean implements SingletonBean {

    private static MySingletonBean singletonBean = new MySingletonBean();

    private MySingletonBean(){

    }

    public static MySingletonBean getSingletonBean(){
        return singletonBean;
    }


    /**
     * Bean который при десериализации
     * всегда возвращает один и тоже объект.
     */
    public Object readResolve() {
        return getSingletonBean();
    }

}
