import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReaderStuffTest {

    String expected = "fileforunittest.txt";
    String currentWord;

    @Test
    void ReaderStuff() throws IOException {

        FileReader fileReader = new FileReader(expected);
        BufferedReader bufferedReader= new BufferedReader(fileReader);

        currentWord = bufferedReader.readLine();
        while (currentWord != null){
            currentWord = bufferedReader.readLine();
            System.out.println(currentWord);
        }
        //Assert
        assertEquals(expected, "fileforunittest.txt");
    }

}