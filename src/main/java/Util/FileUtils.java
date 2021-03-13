package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileUtils {

    public static InputStream getInputStream(String fileName){
        InputStream inputStream = null;
        try{
            if (new java.io.File(fileName).isAbsolute()) {
                return new FileInputStream(fileName);
            } else {
                ClassLoader classLoader = FileUtils.class.getClassLoader();
                inputStream = classLoader.getResourceAsStream(fileName);
                if (inputStream == null) {
                    return new FileInputStream(fileName);
                } else {
                    return inputStream;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return inputStream;
    }
}
