package Java;

import java.util.Scanner;

public class REC_5_TraceTranspose {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows and columns ::");

            int rows = sc.nextInt();
            int cols = sc.nextInt();

            int [][]matrix = new int[rows][cols];

            System.out.println("Enter the elements of the matrix :: ");

            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }

            int trace = 0;
            for(int i=0; i<Math.min(rows, cols); i++){

                trace += matrix[i][i];
            }

            int[][] transpose = new int[rows][cols];
            
            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                    transpose[j][i] = matrix[i][j];
                }
            }

            System.out.println("Trace of the matrix is :: " + trace);

            System.out.println("Original Matrix is :: ");

            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                    System.out.print(matrix[i][j] + " ");
                }

                System.out.println();
            }

            System.out.println("Transpose of the matrix is :: ");

            for(int i=0; i<cols; i++){
                for(int j=0; j<rows; j++){
                    System.out.print(transpose[i][j] + " ");
                }

                System.out.println();
            }
        }
    }
}
