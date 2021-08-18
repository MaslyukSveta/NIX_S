package com.nixsolutions.masliuk.processor;

import com.nixsolutions.masliuk.exceptions.MessageIsNotFormattedException;
import com.nixsolutions.masliuk.interfaces.IOneMessageFileLogger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OneMessageFileLoggerProcessor implements IOneMessageFileLogger {


    @Override
    public void log(String message) throws Exception {

        try {
            File file = new File("Example.txt");
            // проверка на файл существует или нет
            if(!file.exists()){
                //Создайте новый файл
                file.createNewFile();
            }else {
                throw new IOException("Фаил уже существует");
            }


            if (!message.startsWith(MESSAGE_STARTS_WITH)) {
                try {
                    throw new MessageIsNotFormattedException(message);
                } catch (MessageIsNotFormattedException e) {
                    e.toString();
                }
            }

            // Создание файла
            file.createNewFile();

            // Создание объекта FileWriter
            FileWriter writer = new FileWriter(file);

            //запись в файл
            writer.write(message);

        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e1) {
            e1.printStackTrace();
        }
    }

}
