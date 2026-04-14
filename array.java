// import java.util.*;

// public class araay {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter elements:");

//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Array elements are:");


//         //print 
//         int min = arr[0];
//         for(int i = 0; i < n; i++) {
//             if(arr[i] < min){
//                 min = arr[i];
//             }
//         }

//         System.out.print("Your min element is " + min);


//     }
// }

//-----------------------------------------------------------


//secnd largest ele 
import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {

            if(arr[i] > first) {
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        System.out.println(second);
    }
}

//Array: 3 8 2 10 5 6