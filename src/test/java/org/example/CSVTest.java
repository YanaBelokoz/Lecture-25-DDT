package org.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;

public class CSVTest {

    @DataProvider(name="Test")
    public Iterator<Object[]>dataset(){
        return new CSVReader().readFromCSV();
    }

    @Test(dataProvider = "Test")
    public void testWithCsv(String valueA, String valueB) {
        System.out.println(valueA + " contains " + valueB);
        Assert.assertTrue(valueA.contains(valueB));
    }
}
