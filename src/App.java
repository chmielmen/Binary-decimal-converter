import java.util.Scanner;

public class App {
    public static void nav() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("<<<<<<<<<< BINARY & DECIMAL CONVERTER >>>>>>>>>>" );
        System.out.println("=================================================");
        System.out.println("Type numer: ");
        try {
            int number1 = scanner.nextInt();
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect number, try again");
            nav();
        }
    }

    public static void main(String[] args) {
        nav();


    }

}
