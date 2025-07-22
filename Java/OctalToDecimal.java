package weekone;

public class OctalToDecimal {
    public static void main(String[] args) {
        String octal = "156";
        int decimal = 0;
        int base = 1;

 
        for (int i = octal.length() - 1; i >= 0; i--) {
            char ch = octal.charAt(i);

            if (ch >= '0' && ch <= '7') {
                decimal += (ch - '0') * base;
            } else {
                System.out.println("Invalid octal digit: " + ch);
                return;
            }

            base *= 8;
        }

        System.out.println("Decimal value: " + decimal);
    }
}

