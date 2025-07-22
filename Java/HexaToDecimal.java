package weekone;

public class HexaToDecimal {
    public static void main(String[] args) {
        String hexa = "FF"; 
        int decimal = 0;
        int base = 1;  

        for (int i = hexa.length() - 1; i >= 0; i--) {
            char ch = hexa.charAt(i);

            if (ch >= '0' && ch <= '9') {
                decimal += (ch - '0') * base;
            } else if (ch >= 'A' && ch <= 'F') {
                decimal += (ch - 'A' + 10) * base;
            } else if (ch >= 'a' && ch <= 'f') {
                decimal += (ch - 'a' + 10) * base;
            } else {
                System.out.println("Invalid Hexadecimal Character: " + ch);
                return;
            }

            base *= 16;
        }

        System.out.println("Decimal value: " + decimal);
    }
}
