package Util;

import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

public class FileUtilsTest {

    @Test
    public void test() {
        InputStream inputStream = FileUtils.getInputStream("file1.txt");
        assertNotNull(inputStream);
        inputStream = FileUtils.getInputStream("file2.txt");
        assertNotNull(inputStream);
    }

}