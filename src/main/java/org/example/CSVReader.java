package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSVReader{
    public static final String PATH_TO_CSV_READER = "src\\test\\resources\\Test.csv";

    public Iterator<Object[]> readFromCSV() {
        List<Object[]> testCases = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(PATH_TO_CSV_READER))) {
            List<String[]> r;
            r = reader.readAll();
            testCases.addAll(r);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return testCases.iterator();
    }
}


