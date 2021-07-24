package utils;

import org.junit.jupiter.api.Assertions;

public class AssertionsClass {


    public static void assertText(String expected, String actualValue){

        Assertions.assertEquals(expected, actualValue, "No se presenta el texto esperado " + expected);

    }

    public static void assertTitle(String expected, String actualValue){

        assertText(expected, actualValue);

    }

    public static void assertHeader(String expected, String actualValue){

        assertText(expected, actualValue);

    }


}
