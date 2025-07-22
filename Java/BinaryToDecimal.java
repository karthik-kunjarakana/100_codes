package weekone;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1010"; 
        int decimal = 0;
        int base = 1; 
        for (int i = binary.length() - 1; i >= 0; i--) {
            char ch = binary.charAt(i);
            if (ch == '1') {
                decimal += base;
            } else if (ch != '0') {
                System.out.println("Invalid binary character: " + ch);
                return;
            }
            base *= 2;
        }

        System.out.println("Decimal value: " + decimal);
    }
}
