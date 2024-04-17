package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileUtils {

    /**
     * Searches and locates a file as if its name is
     * <ol>
     *     <li>An absolute file name</li>
     *     <li>A relative file name</li>
     *     <li>A file name under resources directory</li>
     * </ol>
     * @param fileName File name (can be absolute or relative)
     * @return Input stream if it exists, otherwise null.
     */
    public static InputStream getInputStream(String fileName){
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
        } catch (FileNotFoundException ignored) {
        }
        return null;
    }
}
