/*/package day_3;

Q.1>> WAP a program to find factorial of a given number taken from user using for loop.
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = ab.nextInt();

        ab.close();

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " = " + factorial);
    }
}

Q.2>> WAP to print below pattern
* * * * *
* * * *
* * *
* *
*


public class Pattern {
    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--) {
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}

Q.3 >> WAP to print whether a given number entered by is prime by using for loop


import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        scanner.close();

        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && num != 1) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}



//Q.4>> WAP to cheak whether is aan Armstrong or not.


import java.util.*;

public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        return sum == num;
    }
}


Q.5>> Define a class student with the following specifications:
Adm_no - integer
Sname - 20 characters
Eng, math, science - float (marks in three subjects)
Total - float
Ctotal() - a function to calculate eng + math + science marks
Public member functions of class student as
Takedata()-- function to accept values for adm_no , sname, marks in eng, math, science and invoke 
ctotal() to calculate total.


import java.util.*;

public class Student {
    int admNo;
    String sName;
    float eng, math, science, total;

    public void takeData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter admission number: ");
        admNo = scanner.nextInt();
        System.out.println("Enter student name: ");
        sName = scanner.next();
        System.out.println("Enter marks in English: ");
        eng = scanner.nextFloat();
        System.out.println("Enter marks in Math: ");
        math = scanner.nextFloat();
        System.out.println("Enter marks in Science: ");
        science = scanner.nextFloat();
        scanner.close();
        cTotal();
    }

    public void cTotal() {
        total = eng + math + science;
    }

    public void showData() {
        System.out.println("Admission Number: " + admNo);
        System.out.println("Student Name: " + sName);
        System.out.println("English Marks: " + eng);
        System.out.println("Math Marks: " + math);
        System.out.println("Science Marks: " + science);
        System.out.println("Total Marks: " + total);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.takeData();
        student.showData();
    }
}


Q.6>>  Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row. The pattern is as follows :  
1
22
333
4444



public class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


Q.7>> . Write a class FibonacciSeries with a main method. The method receives one command line argument showing the number till to show the series. Write a program to display fibonacci series i.e. 0 1 1 2 3 5 8 13 21


public class FibonacciSeries {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + n + ": ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}


Q.8>> A class NumberPalindrome with a public method isNumberPalindrome that takes one parameter number of type int. Write a code to check whether the given number is palindrome or not.
For example Cmd Args : 333
333 is a palindrome (using command line argument)

public class NumberPalindrome {
  public static void main(String[] args) {
      int number = Integer.parseInt(args[0]);
      if (isNumberPalindrome(number)) {
          System.out.println(number + " is a palindrome.");
      } else {
          System.out.println(number + " is not a palindrome.");
      }
  }

  public static boolean isNumberPalindrome(int number) {
      int reverse = 0;
      int original = number;
      while (number != 0) {
          int remainder = number % 10;
          reverse = reverse * 10 + remainder;
          number /= 10;
      }
      return original == reverse;
  }
}






Q.9>> Given a number N. Count the number of digits in it by implementing a class called NumCount with n as a member which receives the data from a parametrized constructor and works on logic
Input Format:
First line of input contains a integer value N.
Output format
print the total number of digits
Constraint
1<=N<=10^5
ex input 2346
output
4


public class NumCount {
  int n;

  public NumCount(int n) {
      this.n = n;
  }

  public int countDigits() {
      int count = 0;
      while (n != 0) {
          n /= 10;
          count++;
      }
      return count;
  }

  public static void main(String[] args) {
      NumCount numCount = new NumCount(2346);
      System.out.println("Total number of digits: " + numCount.countDigits());
  }
}



Q.10>> Given a number N, find the sum of series 1+2+3+...+N.
Implement using static member and a static method.
Input= 5
output= 15

public class SumOfSeries {
  public static int sumOfSeries(int n) {
      int sum = 0;
      for (int i = 1; i <= n; i++) {
          sum += i;
      }
      return sum;
  }

  public static void main(String[] args) {
      int n = 5;
      System.out.println("Sum of series: " + sumOfSeries(n));
  }
}

*/