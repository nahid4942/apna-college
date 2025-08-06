package recursion;

public class class3 {


   public static int sum (int n){
    if(n==1){
        return 1;
    }
    int snm1 = sum(n-1);
    int sn = n + snm1;
    return sn;
   }
    
    public static void main(String[] args) {
        System.out.println("recursion");
        int n = 5 ;
        System.out.println(sum(n));
        
    }
}
