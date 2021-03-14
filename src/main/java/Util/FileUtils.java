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
                try {
                    return new FileInputStream(fileName);
                } catch (FileNotFoundException e) {
                    ClassLoader classLoader = FileUtils.class.getClassLoader();
                    return classLoader.getResourceAsStream(fileName);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return inputStream;
    }
}
