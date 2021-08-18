package com.nixsolution.masliuk;


import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Main {

    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {

        IO io = new IO();
        NIO nio = new NIO();

        io.gzip("intest.txt", "12_io");

        LOGGER.info(String.valueOf(io.searchText("intest.txt", "mark")));

        File file = new File("D:\\");
        String ext = ".txt";
        LOGGER.info(String.valueOf(io.search(file, ext)));


        Path path = Path.of("D:\\");
        LOGGER.info(String.valueOf(nio.search(path, ext)));

    }
}
