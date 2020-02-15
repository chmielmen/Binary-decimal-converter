
public class ToBinary {
    public static void toBinary(long decimal, String result) {
        if (decimal == 0) {
            System.out.println("\nResult binary -> ");
            for (int i = result.length() - 1; i >= 0; i--) {
                System.out.print(result.charAt(i));
            }
            System.out.println(" ");
            App.main(null);

        } else {
            if ((decimal % 2) == 1) {
                result += "1";
                toBinary(decimal / 2, result);
            } else if ((decimal % 2) == 0) {
                result += "0";
                toBinary(decimal / 2, result);
            }
        }
    }
}