import java.util.HashMap;
import java.util.Map;

public interface CharacterCountMap
{
    //Create a method that count the Characters of a String letters
    //Like kbikelkie
    // k -> 3, b -> 1, i -> 2, e -> 2, l -> 1
    // bike and like
    //I could implement it in my ReaderStuffClass and could pass any parameter like
    //the input from the user for example the poles of letter
    //and the data that the BufferedReader Class
    static Map getCharacterCountMap(String letters)
    {
        Map<Character, Integer> lettersCountMap = new HashMap<>();

        for (int i = 0; i < letters.length(); i++)
        {
            char currentChar = letters.charAt(i);

            int count = lettersCountMap.getOrDefault(currentChar, 0);

            lettersCountMap.put(currentChar, count + 1);
        }

        return lettersCountMap;
    }

}

