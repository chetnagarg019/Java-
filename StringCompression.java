import java.util.Scanner;

public class StringCompression {

    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 0;
            }
        }

        // Agar compressed str small hai to return 
        if (compressed.length() < str.length()) {
            return compressed.toString();
        } else {
            return str; 
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = compressString(input);

        System.out.println("Result: " + result);

        sc.close();
    }
}