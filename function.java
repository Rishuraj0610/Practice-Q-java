
/*import java.util.Scanner;

public class function {
    public static void printMyName(String name){
        System.out.println(name);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);
    }
}
    
import java.util.*;
public class function {
   // public static int calculateSum(int a, int b) {
   //     int sum = a + b;
   //     return sum;
   // }
   public static int calculateProduct(int a, int b) {
      return a + b;
   }

       public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       System.out.println(calculateProduct(a, b));
   }
}*/

import java.util.Scanner;

public class function{
public static void printFactorial(int n) {
    //loop
    if(n < 0) {
        System.out.println("Invalid Number");
        return;
    }
    int factorial = 1;


    for(int i=n; i>=1; i--) {
        factorial = factorial * i;
    }


    System.out.println(factorial);
    
}       
     public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();


       printFactorial(n);
   }
}