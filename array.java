import java.util.*;

public class array {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = 3;
        int col = 3;
        int key = 8;
        boolean flag = false;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                if(key == matrix[i][j]){
                    flag = true;
                    break;

                }
            }
            System.out.println("");
        }

        if(flag == true){
            System.out.println("Key is find : " + key);
        }else{
            System.out.println("Not find");
        }

         //scanner close item

        sc.close();

        
    }

    
}