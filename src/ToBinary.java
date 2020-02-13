
public class ToBinary {
    public static void toBinary(long number1, String result) {
        if (number1 == 0) {
            for (int i = result.length() - 1; i >= 0; i--) {
                System.out.print(result.charAt(i));
            }

            App.main(null);
        } else {
            if ((number1 % 2) == 1) {
                result += "1";
                toBinary(number1 / 2, result);
            } else if ((number1 % 2) == 0) {
                result += "0";
                toBinary(number1 / 2, result);
            }
        }
    }
}