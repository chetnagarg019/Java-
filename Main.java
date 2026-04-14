// import java.util.*;

// public class Fibonacchi {   
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         // Edge case
//         if(n < 0) {
//             System.out.println("Invalid Input");
//             return;
//         }

//         if(n == 0) {
//             System.out.println(0);
//             return;
//         }

//         if(n == 1) {
//             System.out.println(1);
//             return;
//         }

//         long a = 0, b = 1, c = 0;

//         for(int i = 2; i <= n; i++) {
//             c = a + b;
//             a = b;
//             b = c;
//         }

//         System.out.println(c);
//     }
// }

//-------------------------------------------------------------------------------------------------------------
//Rev str


// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();

//         String rev = "";

//         for(int i = s.length() - 1; i >= 0; i--) {
//             rev = rev + s.charAt(i);
//         }

//         System.out.println(rev);
//     }
// }

//


//-------------------------------------------------------------------------------------------------------------
//str palindrome 
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();

//         String rev = "";

//         for(int i = s.length() - 1; i >= 0; i--) {
//             rev = rev + s.charAt(i);
//         }

//         if(s.equals(rev)) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }



//-------------------------------------------------------------------------------------------------------------
// nnumber palindrome 

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int original = n;

//         int rev = 0;

//         while(n != 0) {
//             int digit = n % 10;
//             rev = rev * 10 + digit;
//             n = n / 10;
//         }

//         if(original == rev) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }


//-------------------------------------------------------------------------------------------------------------
// nnumber armstrong


// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int original = n;

//         // Step 1: count digits
//         int temp = n;
//         int digits = 0;

//         while(temp != 0) {
//             digits++;
//             temp = temp / 10;
//         }

//         // Step 2: calculate sum
//         int sum = 0;
//         temp = n;

//         while(temp != 0) {
//             int digit = temp % 10;

//             int power = 1;
//             for(int i = 1; i <= digits; i++) {
//                 power = power * digit;
//             }

//             sum = sum + power;
//             temp = temp / 10;
//         }

//         // Step 3: compare
//         if(sum == original) {
//             System.out.println("Armstrong");
//         } else {
//             System.out.println("Not Armstrong");
//         }
//     }
// }


//------------------------------------------------------------------------------------------

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 4;

        // Upper part
        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower part
        for(int i = n-1; i >= 1; i--) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}