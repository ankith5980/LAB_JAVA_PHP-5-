package Java;

import java.util.Scanner;

public class REC_3_TriType {
    public static void main(String[] args) {
        int side1, side2, side3;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the length of side 1 :: ");
            side1 = sc.nextInt();

            System.out.print("Enter the length of side 2 :: ");
            side2 = sc.nextInt();

            System.out.print("Enter the length of side 3 :: ");
            side3 = sc.nextInt();

            if(side1 == side2 && side2 == side3){

                System.out.println("It's an Equilateral Triangle !!");

                float area1 = (float)((1.732 * side1 * side1)/4);

                System.out.println("Area :: " + area1);
            }

            else if (side1 == side2 || side2 == side3 || side3 == side1) {
                int height;

                System.out.println("It's an Isosceles Triangle !!");

                System.out.print("Enter the Height :: ");

                height = sc.nextInt();

                float area2 = (float)(0.5 * side2 * height);

                System.out.println("Area :: " + area2);
            }

            else {
                int semi;

                System.out.println("It's a Scalene Triangle !!");

                semi = (side1 + side2 + side3)/2;

                float area3 = (float)sqrt(semi * (semi - side1) * (semi - side2) * (semi - side3));

                System.out.println("Area :: " + area3);
            }
        }
    }

    private static float sqrt(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sqrt'");
    }
}
