 import java.util.*;

 public class muliti
 {
    public static void printSpiral(int matrix[][]){
        
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;

        while (startRow <= endRow && startCol <= endCol)
        {
        for (int j = startCol;j=endCol;j++){
            System.out.print(matrix[startRow][j]+" ");
        }
        //right 
        for (int i = startRow+1;i <= endRow;i++){
            System.out.println(matrix[i][endCol]+" ");
             
        }

        }

      
    }
    public static void main(String[]args){
        int matrix [][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        
       
    }
 }

