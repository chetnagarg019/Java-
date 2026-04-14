import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter n:");
        int n = sc.nextInt();

        // Edge case: negative number
        if(n < 0) {
            System.out.println("Invalid Input");
            return;
        }

        long fact = 1;  // int overflow avoid karne ke liye

        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println(fact);
    }
}