package com.nixsolution.masliuk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IO {

    public String searchText(String fileName) throws IllegalArgumentException {

        String year = null;
        String month = null;
        StringBuilder day = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String tmp = "";


            while ((tmp = br.readLine()) != null) {

                String[] s = tmp.split("\\s");

                for (int i = 0; i < s.length; i++) {
                    String res = s[i];
                    if (res.matches("(\\d{4})")) {
                        System.out.println(res);
                        break;
                    }
                    if (res.matches("\\d{2}")) {
                        day.append(res);
                        break;
                    }
                }

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";

    }


    public int daysInMonth7(String input) throws ParseException {

        String regex = "\\d{4}-\\d{2}-\\d{2}";
        Matcher m = Pattern.compile(regex).matcher(input);

        Calendar mothDays = new GregorianCalendar(2002, 5, 1);
        return mothDays.getActualMaximum(Calendar.DAY_OF_MONTH);
    }


    public int daysInMonth8(int year, int month) {
      //  LocalDate localDate = new  LocalDate.of(year, month, 1);
        return 0;
    }





}
