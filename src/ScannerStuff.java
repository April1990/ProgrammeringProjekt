import java.util.Scanner;

public class ScannerStuff {
    String letters;
    String keyboardInput;

    //This constructor will pass any parameter in another method or object in different locale
    public ScannerStuff(String keyboardInput){
        this.keyboardInput = keyboardInput;
    }

    public void scan(){
        //keyboard input from the user
        Scanner scanner = new Scanner(System.in);
        //prompt the user
        System.out.println(this.keyboardInput);
        //In my dictionary files all the words are in CAPITAL letters,
        //if ever the user will in put small letters the .toUpperCase() method will handle it
        letters = scanner.nextLine().toUpperCase();
    }
}

