import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class ReaderStuff extends ScannerStuff implements CharacterCountMap{

    String fileName;
    String consulOutput;
    FileReader fileReader;
    BufferedReader bufferedReader;
    String currentWord;
    boolean canMakeCurrentWord;

    //Extended the ScannerStuff class and add new parameter of a String fileName
    //It will add any locale object
    public ReaderStuff(String fileName, String keyboardInput, String consulOutput) throws IOException {
        super(keyboardInput);
        this.fileName = fileName;
        this.consulOutput = consulOutput;

        super.scan();
        //Implementing the getCharacterCountMap Method in the CharacterCountMap interface and has passed new
        //parameter from the keyboard input or user input that was saved in the String of letters in the ScannerStuff Class
        Map<Character, Integer> lettersCountMap  = CharacterCountMap.getCharacterCountMap(super.letters);
        System.out.println(consulOutput);

        fileReader = new FileReader(fileName);
        bufferedReader = new BufferedReader(fileReader);

        //for loop: first statement is to read every line from the file and save it in the currentWord object;
        //the second is the condition that allow the .readLine method to read more until there is still line to read
        //the last statement is the iterator allows to get the next line to iterate each time to the loop
        for (currentWord = bufferedReader.readLine(); currentWord != null; currentWord = bufferedReader.readLine()) {

            //Implementing the getCharacterCountMap Method in the CharacterCountMap interface and has passed new
            //parameter from the fileReader which was saved in the String of currentWord and pass as a new object
            //of Map of Character and Integers
            Map<Character, Integer> currentWordMap  = CharacterCountMap.getCharacterCountMap(currentWord);

            //Matching the lettersCountMap and the currentWordMap
            canMakeCurrentWord = true;
            for (Character character : currentWordMap.keySet()) {
                int currentWordCharCount = currentWordMap.get(character);
                int lettersCharCount = lettersCountMap.getOrDefault(character, 0);

                if (currentWordCharCount > lettersCharCount) {
                    canMakeCurrentWord = false;
                    break;
                }
            }
            if (canMakeCurrentWord) {
                System.out.println(currentWord);
            }
        }
        bufferedReader.close();
    }
}
