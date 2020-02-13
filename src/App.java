import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void nav() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("<<<<<<<<<< BINARY & DECIMAL CONVERTER >>>>>>>>>>");
        System.out.println("================================================");
        System.out.println("You want to convert: ");
        System.out.println("DECIMAL_ - type d");
        System.out.println("BINARY_ - type b");

        try {
            char command = (char) System.in.read();

            if (command == 'd') {
                System.out.println("Type number: ");

                try {
                    long number1 = scanner.nextInt();
                    String result = "";
                    ToBinary.toBinary(number1, result);
                } catch (InputMismatchException e) {
                    System.out.println("Incorrect number, try again \n");
                    main(null);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            main(null);
        } catch (InputMismatchException e) {
            System.out.println("Wrong command, try again \n");
            main(null);
        }
    }

    public static void main(String[] args) {
        nav();
    }
}