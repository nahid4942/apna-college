package week1;

import java.util.ArrayList;

public class lecture1 {
    public static void main(String[] args) 
    {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(8);
        list.add(4);
        list.add(9);

       

        for(int num :list){
             System.out.println(num);
        };

         System.out.println(list);
         System.out.println(list.get(4));

        




    }
    
}
