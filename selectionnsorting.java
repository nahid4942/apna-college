import.java.util.*;

public class selectionsorting{
    public static void selectionsorting(int arr[]){
        public arr1 []= arr[];
        for (int i= 0; i<arr.length-1;i++){
            int minpos= i;
            for (int j=i+1;j<arr.lenth-1;j++){
                if (arr[minpos]>arr[j]){
                    minpos = j;
                }
            }

            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
 


        }
    }
    public static void main(String[]args){
        int arr [] = {3,6,2,1,8,7,4,5,3,1};

    }
}