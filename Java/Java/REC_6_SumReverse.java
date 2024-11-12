package Java;

import java.util.Scanner;

public class REC_6_SumReverse {

    int num, rem, sum=0, rev=0;

    void sum (int num){
        do{
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        while(num > 0);
        System.out.println("Sum = " + sum);
    }

    void rev (int num){
        do{
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        while(num > 0);
        System.out.println("Reverse = " + rev);
    }

    public static void main(String[] args) {
        int n;
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number :: ");

            n = sc.nextInt();
        }

        REC_6_SumReverse obj = new REC_6_SumReverse();

        obj.sum(n);
        obj.rev(n);
    }
}
