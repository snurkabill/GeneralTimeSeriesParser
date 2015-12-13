package net.snurkabill.stream.reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.stream.Stream;

public class FileReader {

    public static final Logger logger = LoggerFactory.getLogger(FileReader.class.getSimpleName());

    public static Stream<String> readFileAsStream(String pathToFile) throws FileNotFoundException {
        Stream<String> lines = new BufferedReader(new InputStreamReader(new FileInputStream(new File(pathToFile))))
                .lines();
        logger.info("Opened {} file", pathToFile);
        return lines;
    }
}
