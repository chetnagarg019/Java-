import java.util.*;

public class Gym {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month:");
        int month = sc.nextInt();

        if(month <= 0){
            System.err.println("Invalid input");
        }else if(month == 1){
            System.err.println("Fees is 2000");
        }else if(month == 2 || month == 3){
            System.err.println("Fees is 2000");
        }else if(month >= 4 && month <= 6){
            System.err.println("Fees is 9000");
        }else if(month > 6){
            System.err.println("Fees is 15000");
        }

        sc.close();
    }
    
}
