package Java;

import java.util.Scanner;

public class REC_1_Fibonacci {

    public static void main(String[] args) {
        int fib1=0;
        int fib2=1;
        int fib3;

        System.out.print("Enter the limit :: ");
        
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            while (fib1<n) {
                System.out.println(fib1);
                fib3=fib1+fib2;
                fib1=fib2;
                fib2=fib3;
            }
        }
    }
}