package com.mainacad.service;

import java.io.File;
import java.io.FileWriter;
import java.util.logging.Logger;
import com.mainacad.exceptions.MyCustomException;

public class NumberService {

    private static final Logger LOGGER = Logger.getLogger(NumberService.class.getName());

    public static Double getDivResult(int number1, int number2) throws MyCustomException{
        Double result = null;
//        try {
            result = Double.valueOf(number1 / number2);

            File file = new File("C:/work/logs.text");
        try { FileWriter writer = new FileWriter(file);
            writer.write("text");
        } catch (Exception e) {
            try {
            throw new MyCustomException("something wrong");
        } catch (MyCustomException ex) {
                ex.printStackTrace();
            }
            }
//        } catch (Exception e) {
//            LOGGER.severe("There is zero as divider!");
//        } finally {
//            result = 0.0;
//        }

        return result;
    }


}

