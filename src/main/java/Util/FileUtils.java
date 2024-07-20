package Util;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

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

    /**
     * Reads string hash map from an input file.
     * @param fileName Input file containing hash map. Each line of the file contains two words separated via space.
     */
    public static HashMap<String, String> readHashMap(String fileName){
        HashMap<String, String> result = new HashMap<>();
        String line;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(FileUtils.getInputStream(fileName), StandardCharsets.UTF_8));
            line = br.readLine();
            while (line != null) {
                String[] items = line.split(" ");
                result.put(items[0], items[1]);
                line = br.readLine();
            }
        } catch (IOException ignored) {
        }
        return result;
    }

}
