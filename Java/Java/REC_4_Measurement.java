package Java;

import java.util.Scanner;

public class REC_4_Measurement {
    public static void main(String[] args) {
        
        double INCH = 0.394;
        double METER = 0.01;
        double KILOMETER = 0.00001;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the length in Centimeters :: ");

            double cm = sc.nextInt();

            double inch = cm * INCH;
            double meter = cm * METER;
            double kilometer = cm * KILOMETER;

            System.out.println(cm + "cm is equal to :: " + inch + " " + "inch(es)");

            System.out.println(cm + "cm is equal to :: " + meter + " " + "meter(s)");

            System.out.println(cm + "cm is equal to :: " + kilometer + " " + "kilometer(s)");
        }

    }
}
