package com.nixsolution.masliuk;

import com.nixsolutions.ppp.generics.Summator;

import java.util.HashMap;
import java.util.Map;

public class SummatorFloat implements Summator {

    Map<String, Double> resultSet = new HashMap<>();

    @Override
    public Map<String, Double> sum(Map data) {
        double summa = 0.0;
        for(Object stringDoubleEntry : data.entrySet()){
            summa +=(double) stringDoubleEntry.notifyAll(toString());
        }
        return null;
    }

}
