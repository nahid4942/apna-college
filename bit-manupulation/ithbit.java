public class ithbit {

    //for the its bit number 

    // get ith bit 

    //set ith bit 


    //clear ith bit 


    public static int   getithbit(int n  , int i){
        int bitmask = 1<<i;
        if((n & bitmask )==0){
            return 0;

        } else {
            return 1;
        }
    }
     public static void main (String[]args){

        System.out.println(getithbit(10 ,2));
     }
}
