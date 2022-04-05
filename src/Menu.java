import java.io.IOException;
import java.util.Scanner;

public class Menu extends LocaleData {

    boolean exit;
    int choice;

    public void runMenu() throws IOException {
        printHeader();
        while (!exit) {
            super.displayMenu();
            choice = getInput();
            performAction(choice);
        }
    }

    private void printHeader() {
        System.out.println("||==========================||");
        System.out.println("||      SCRABBLE GAME       ||");
        System.out.println("||==========================||");
    }

    private int getInput() {
        Scanner keyboardInput = new Scanner(System.in);

        choice = -1;
        while (choice < 0 || choice > 5) {
            try {
                System.out.println("\nPlease enter your choice:");
                choice = Integer.parseInt(keyboardInput.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection please try again.");
            }
        }
        return choice;
    }

    private void performAction(int choice) throws IOException {
        switch (choice) {
            case 5:
                exit = true;
                System.out.println("Thank you for playing:");
                break;
            case 1:
                super.englishRun();
                break;
            case 2:
                super.swedishRun();
                break;
            case 3:
                super.spanishRun();
                break;
            case 4:
                super.filipinoRun();
                break;
            default:
                System.out.println("Unknown error has occurred:");
        }
    }

}
