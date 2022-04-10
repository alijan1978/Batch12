package Class31;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo1 {
    public static void main(String[] args) throws IOException {

        // first step: locating the file that we want to read.
        String path="Files/Config.properties";

        // Navigate to that location
        FileInputStream fileInputStream = new FileInputStream(path);

        // That special class which knows how to read the .properties file
        Properties properties = new Properties();

        // Loading all the data from the file to properties' file into the object
        properties.load(fileInputStream);

        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));

    }
}
