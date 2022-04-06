import java.io.IOException;
import java.util.ArrayList;

//This is a class for the different languages. We can create new language by just creating new object
//that can read the file dictionary for a specific desire language.
//I did it like this to make it easier to add another language without the need of creating another classes
//like a scanner class and a reader class that read the file that contains words of dictionaries.
public class LocaleData {
    public void displayMenu(){
        System.out.println("\n||==========================||");
        System.out.println("||            MENU          ||");
        System.out.println("||==========================||");
        System.out.println("|| 1) English Version       ||");
        System.out.println("|| 2) Svenska Versionen     ||");
        System.out.println("|| 3) Versión En Español    ||");
        System.out.println("|| 4) Bersyon Para Filipino ||");
        System.out.println("|| 5) Exit                  ||");
        System.out.println("||==========================||");
    }

    public void englishRun() throws IOException {
        ReaderStuff englishOutput = new ReaderStuff("englishdictionary.txt",
                "Enter the poles of letters:",
                "\nAll possible answers:");
        System.out.println(englishOutput);
    }

    public void swedishRun() throws IOException {
        ReaderStuff swedishOutput = new ReaderStuff("swedishdictionary.txt",
                "Vänligen ange krafsa bokstäverna:",
                "\nAll möjliga svar:");
        System.out.println(swedishOutput);
    }

    public void spanishRun() throws IOException {
        ReaderStuff spanishOutput = new ReaderStuff("spanishdictionary.txt",
                "Por favor ingrese los polos de las letras:",
                "\nTodas las respuestas posibles:");
        System.out.println(spanishOutput);
    }

    public void filipinoRun() throws IOException {
        ReaderStuff filipinoOutput = new ReaderStuff("filipinodictionary.txt",
                "Pumili ng mga letra:",
                "\nLahat ng posibling sagot:");
        System.out.println(filipinoOutput);

    }
}
