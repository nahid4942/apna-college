package array;
 
import java.util.*;

public class multiplearr {



    public static  void printarry (int arr[][])
    {
        for(int i = 0 ; i < arr.length;i++){
            for(int j = 0; j < arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void addittion (int arr[][]){
        int sum = 0; 
        for(int i = 0 ; i < arr.length;i++){
            for(int j = 0;j < arr[i].length ; j++){
                sum += arr [i][j];
            }
        }
    }
    




    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Eneter the number of rows");
        int r = sc.nextInt();
        
        System.out.println("enter the collum number ");
        int c = sc.nextInt();

        int arr [][] = new int [r][c];

        
    }



}