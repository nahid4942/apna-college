package recursion;

public class class1 {



    public static  void function(int n ){
        if(n==1){
            System.out.println(n);
            return;

        } 
      
        function(n-1);
          System.out.println(n+" ");


    }
    
    public static void main(String[] args) {
        System.out.println("recursion");
        int n = 10 ;
        function(n);
    }
}
