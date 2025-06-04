public class bit1 {

    //bit manupulation 

    //decimel number System -0,1,,3,4,5,6,7,8,9,
    // binary number system 0,1


     // binary AND  if we take 0 and 1 = 0 
     //              if we take 1 and 0 = 0 
      // if we take 0 and 0 
      // if we take 1and 1 = 1 

      public static void main(String[]args){

        System.out.println((5 & 6));// AND 

        System.out.println((5 | 6));// or

        System.out.println((5 ^ 6));//xor

        System.out.println(( ~ 6));// ones complement (not of)

        System.out.println((5 << 6));//binary left shift 
        
        System.out.println((5 >> 6));//binary left shift 

      }   
}
