package com.mainacad;

import com.mainacad.service.NumberService;

import java.util.logging.Logger;

public class AppRunner {

    private static final Logger LOGGER = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) {
//        String text = null;
//        LOGGER.info("Length is " + text.length());

        try {
            LOGGER.info("Result is " + NumberService.getDivResult(12, 0));
        } catch (Exception e) {
            LOGGER.severe("There is zero as divider!");
        }

    }
}
