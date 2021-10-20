package math;

import java.util.Scanner;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */


        //implementation here...
//
//        int factorial = fact(5);
//        System.out.println("Factorial of 5 is: "+factorial);
//    }
//    static int fact(int n)
//    {
//        int output;
//        if(n==1){
//            return 1;
//        }
//        //Recursion: Function calling itself!!
//        output = fact(n-1)* n;
//        return output;
//    }
//}
//        long i, frl = 1;
//        long number = 5;//It is the number to calculate factorial
//
//        for (i = 1; i <= number; i++) {
//            frl = frl * i;
//        }
//        System.out.println("Factorial of " + number + " is: " + frl);
//
//        System.out.println("Factorial of 5 is: " + factorial(5));
//
//    }
//
//
//    static int factorial(int n) {
//        if (n == 0)
//            return 1;
//        else
//            return (n * factorial(n - 1));
//    }
//
//
//}
        long i, frl = 1;
        long number = 5;//It is the number to calculate factorial

        for (i = 1; i <= number; i++) {
            frl = frl * i;
        }
        System.out.println("Factorial of " + number + " is: " + frl);

        System.out.println("Factorial of 5 is: " + factorial(5));

    }


    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }


}