package Java;

import java.util.Scanner;

public class REC_1_Fibonacci {

    public static void main(String[] args) {
        int fib1=0;
        int fib2=1;
        int fib3, i;

        System.out.print("Enter the limit :: ");
        
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            System.out.println(fib1);
            System.out.println(fib2);

            for(i=0; i<=(n-3); i++){

                fib3=fib1+fib2;
                fib1=fib2;
                fib2=fib3;

                System.out.println(fib3);
            }
        }
    }
}