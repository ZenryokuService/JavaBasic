package ysg.tkm.util;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

public class FileCtlUtilTest {
    private static FileCtlUtils target;

    @BeforeClass
    public static void init() {
    }

    @Test
    public void testFileRead01() {
        BufferedReader buf;
        try {
            buf = FileCtlUtils.fileRead("zenkoku.csv");
            assertNotEquals("", buf.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            fail();
        }

    }
}
