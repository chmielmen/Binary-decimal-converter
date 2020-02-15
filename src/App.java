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
        System.out.println("DECIMAL - type d");
        System.out.println("BINARY - type b");

        try {
            char command = (char) System.in.read();

            if (command == 'd') {
                System.out.println("Type decimal number: ");
                long decimal = scanner.nextInt();

                if ((decimal * 1) == decimal) {
                    String result = "";
                    ToBinary.toBinary(decimal, result);
                } else {
                    System.out.println("Wrong number, try again");
                    main(null);
                }
            } else if (command == 'b') {
                System.out.println("Type binary number: ");
                String binary = scanner.next();

                if ((binary.contains("0") && binary.contains("1")) || binary.equals("0") || binary.equals("1")) {
                    ToDecimal.toDecimal(binary);
                } else {
                    System.out.println("Wrong number, try again");
                    main(null);
                }
            } else {
                System.out.println("Wrong command, try again");
                main(null);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Wrong command, try again \n");
            main(null);
        }
    }

    public static void main(String[] args) {
        nav();
    }
}