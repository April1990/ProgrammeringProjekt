import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ScannerStuffTest {
    String keyboardInput = "Enter the poles of letters:";
    InputStream in = System.in;

    @Test
    void scan() {
       Scanner scanner = new Scanner(in);
       System.out.println(keyboardInput);
       System.out.println(scanner);
       assertEquals(keyboardInput, keyboardInput);

    }

}