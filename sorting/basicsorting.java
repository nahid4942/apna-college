package sorting;

public class basicsorting
 {

    public static int swap;

    public static void bubblesort(int arr[]){
        for( int turn = 0 ; turn<arr.length-1;turn++
        ){
            for(int j= 0; j<arr.length-1-turn;j++){

                if (arr[j]> arr[j+1]){
                    swap++;
                    
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] =temp;

                }

            }
        }
    }

    public static void selectionsort(int arr[]){
        for(int i = 0 ; i <arr.length-1;i++){
            int minpos = i ;
            for (int j =i+1;j<arr.length-1;j++){
                if (arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            //swaping 
            int temp = arr[minpos];
            arr[minpos]=arr[i];
            arr[i] = temp;
            swap++;
        }

    }

   public static void printarr(int arr[]){
    for(int i = 0; i<arr.length;i++){
        System.out.print(arr[i]+"");

    }
    System.out.println();
    System.out.print("shawps :" +swap);
   }





    public static void main (String []args)
    {

        int arr [] = {5,3,6,2,3,1,7};
       // bubblesort(arr);
        //printarr(arr);
        selectionsort(arr);
        printarr(arr);



    }
    
}
