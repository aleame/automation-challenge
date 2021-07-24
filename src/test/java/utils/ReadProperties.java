package utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args){
        readPropertiesFile();
    }

    public static void readPropertiesFile(){
        try {
            Properties prop = new Properties();
            InputStream input = new FileInputStream("config.propesties");
            prop.load(input);
            System.out.println(prop.getProperty("appUrl"));
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
