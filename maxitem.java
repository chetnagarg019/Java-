import java.util.*;

public class maxitem {

    public static int maxEleFind(int arr[]){

        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;

        for(int i = 0; i < n; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        }

        //map.put(key -> value) // map.getOrDefault(key , default value)

        int maxCount = 0;
        int maxElement = arr[0];

        //max frequncy 
        for(int key : map.keySet()){
            if(map.get(key) > maxCount){ /// is is the
                maxCount = map.get(key);
                maxElement = key;
                
            }
        }

        return maxElement;

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n elements:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

      
        System.out.println("max Ele is: "+maxEleFind(arr)); // gieven the max item of arr 
        




        
 
       

    }
}
