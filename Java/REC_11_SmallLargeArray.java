package Java;

import java.util.Scanner;

public class REC_11_SmallLargeArray {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int i, j, temp, n = 10;

            int a[] = new int[10];

            System.out.println("Enter 10 Elements :: ");

            for(i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            for(i=0; i<n; i++){
                for(j=i+1; j<n; j++){
                    if(a[i]>a[j]){
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }

            System.out.println("Smallest :: " + a[0]);

            System.out.println("Largest :: " + a[n-1]);

            System.out.println("Second Largest :: " + a[n-2]);
        }
    }
}
