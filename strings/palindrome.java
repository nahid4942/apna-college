package strings;

import java.util.Scanner;
public class palindrome {
    public static void main(String[]args){

      Scanner sc = new Scanner(System.in);
      String check;

      System.out.println("enter the text to check");

      check = sc.nextLine();
      String rev = "";
      for(int i = 0; i <check.length();i++){
        rev = check.charAt(i)+rev;
      }
      if (check.equals(rev)){
        System.out.println("palindrome");
      } else {
        System.out.println("not palindrome");
      }

    }
}
