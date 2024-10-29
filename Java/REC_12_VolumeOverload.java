package Java;

import java.util.Scanner;

class Volume{

    // CALCULATE THE VOLUME OF A CUBE
    void FindVolume(double side){
        double volume = side * side * side;

        System.out.println("Volume of Cube :: " + volume);
    }

    // CALCULATE THE VOLUME OF A RECTANGULAR BOX OR CUBOID
    void FindVolume(double length, double width, double height1){
        double volume = length * width * height1;

        System.out.println("Volume of the Rectangular Box :: " + volume);
    }

    // CALCULATE THE VOLUME OF A CYLINDER
    void FindVolume(double radius, double height2){
        double volume = Math.PI * radius * radius * height2;

        System.out.println("Volume of the Cylinder :: " + volume);
    }
}

public class REC_12_VolumeOverload {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            Volume volcalc = new Volume(); //object of the class named volume 

            // voulume of the cube
            System.out.println("Enter the sides of the cube :: ");
            double side = sc.nextDouble(); // All 3 dimensions of a cube
            volcalc.FindVolume(side);

            System.out.println();

            // voulume of the rectangular box or cuboid
            System.out.println("Enter the length of the rectangular box :: ");
            double length = sc.nextDouble(); //length of the box
            System.out.println("Enter the width of the rectangular box :: ");
            double width = sc.nextDouble(); // width of the box
            System.out.println("Enter the height of the rectangular box :: ");
            double height1 = sc.nextDouble(); // heigth of the box
            volcalc.FindVolume(length, width, height1);

            System.out.println();

            // volume of the cylinder
            System.out.println("Enter the radius of the Cylinder :: ");
            double radius = sc.nextDouble(); // radius of the cylinder
            System.out.println("Enter the height of the Cylinder :: ");
            double height2 = sc.nextDouble(); // height of the cylinder
            volcalc.FindVolume(radius, height2);
        }
    }
}