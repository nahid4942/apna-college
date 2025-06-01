
public class printallarr {
    public static void main(String[]args)
    {
        int arr [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for (int i = 0; i < arr.length-1;i++){
            for (int j = 0; j<arr.length-1;j++){
                System.out.println(arr[i][j]);
            }
        }

    }
    
}
