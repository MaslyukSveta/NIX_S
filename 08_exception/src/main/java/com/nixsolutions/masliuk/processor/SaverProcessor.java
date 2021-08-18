package com.nixsolutions.masliuk.processor;

import com.nixsolutions.masliuk.interfaces.ISaver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaverProcessor implements ISaver {

    public SaverProcessor() {

    }

    @Override
    public void save(String text, String fileAbsolutePath) {

        try {
            // Возьмите файл
            File file = new File(fileAbsolutePath + "example.txt");

            // Убедитесь, что он не существует
            if(!file.exists()){
                //Создайте новый файл
                file.createNewFile();
            }else {
                throw new IOException("Фаил уже существует");
            }
            // Создание объекта FileWriter
            FileWriter writer = new FileWriter(file);

            //запись в файл
            writer.write(text);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


}
