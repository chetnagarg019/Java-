import java.util.Arrays;
import java.util.Scanner;


public class SumLowestElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array (N): ");
        int N = sc.nextInt();

        int[] arr = new int[N]; //create new array

        // Input array elements
        System.out.println("Enter " + N + " elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Input M
        System.out.print("Enter number of lowest elements to sum (M): ");
        int M = sc.nextInt();

        // Sort array
        Arrays.sort(arr);

        int sum = 0;

        // Sum of lowest M elements
        for (int i = 0; i < M; i++) {
            sum += arr[i];
        }

        // Output
        System.out.println("Sum of lowest " + M + " elements is: " + sum);

        sc.close();
    }
}