

public class ToDecimal {
    public static void toDecimal(String binary) {
        int result = 0;
        int position = 1;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1')
                result = result + position;
            position = position * 2;
        }

        System.out.println("Result decimal -> " + result);
        App.main(null);
    }
}
