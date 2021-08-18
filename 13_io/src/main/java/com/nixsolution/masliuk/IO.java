package com.nixsolution.masliuk;

import com.nixsolution.masliuk.io.IOUtils;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class IO implements IOUtils {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(IO.class.getName());


    /**
     * Функция сжимает fileName и ложит результат с расширением ".gzip" в директорию folder, для сжатия потока используется GZIPOutputStream
     *
     * @param fileName – путь к файлу
     * @param folder   – директория для сохранения сжатого файла
     * @return полный путь к новому файлу, включая имя файла.
     * @throws IllegalArgumentException – если fileName не возможно создать или folder не существует
     */
    @Override
    public String gzip(String fileName, String folder) throws IllegalArgumentException {

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "GBK"));

            BufferedOutputStream out = new BufferedOutputStream(new GZIPOutputStream(
                    new FileOutputStream(folder + "." + fileName + ".gzip")));

            int c;

            while ((c = in.read()) != -1) {
                out.write(String.valueOf((char) c).getBytes("GBK"));
            }

            in.close();
            out.close();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return (folder + "." + fileName + ".gzip");

    }

    /**
     * Функция ищет в текстовом fileName все вхождения mark и возвращает количество строк, в которых встречается mark.
     *
     * @param fileName – путь к файлу
     * @param mark     – текст для поиска
     * @return количество строк, в которых встречается mark.
     * @throws IllegalArgumentException – если file не существует
     */

    @Override
    public Integer searchText(String fileName, String mark) throws IllegalArgumentException {

        int countLines = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String tmp = "";

            while ((tmp = br.readLine()) != null) {

                String[] s = tmp.split("\\s");

                for (int i = 0; i < s.length; i++) {
                    String res = s[i];
                    if (res.equals(mark)) {
                        countLines++;
                        break;
                    }
                }

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (countLines);
    }

    /**
     * Функция ищет все файлы с расширением ext в folder директории и поддиректориях
     * и возвращает их полные пути в виде массива строк.
     * В случае если extention == null считаем что это пустая строка и ищем все файлы.
     *
     * @param folder – корневая директория для поиска
     * @param ext    – расширение файла
     * @return список найденных файлов с абсолютными путями.
     * @throws IllegalArgumentException – если folder не существует
     */

    @Override
    public String[] search(File folder, String ext) throws IllegalArgumentException {

        String[] strings = new String[]{};

        try {

            File file = new File(String.valueOf(folder));

            if (!file.exists()) {
                throw new IllegalArgumentException("папки не существует");
            }

            File[] listFiles = file.listFiles(new MyFileNameFilter(ext));

            if (listFiles.length == 0) {
                LOGGER.info(folder + " не содержит файлов с расширением " + ext);
            } else {

                for (File f : listFiles) {
                    strings[strings.length] = f.getAbsolutePath();

                }
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return (strings);
    }

    /**
     * Дополнительний класс к заданию search()
     */
    private class MyFileNameFilter implements FilenameFilter {

        private String ext;

        public MyFileNameFilter(String ext) {
            this.ext = ext.toLowerCase();
        }

        @Override
        public boolean accept(File dir, String name) {
            return (name.toLowerCase().endsWith(ext));
        }
    }
}
