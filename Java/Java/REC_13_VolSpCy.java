package Java;

import java.util.Scanner;

class Vol_3D{

    double sphereradius, cylinderradius, cylinderheight;

    void readdata(){

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius of the Sphere :: ");
            sphereradius = sc.nextDouble();

            System.out.println();

            System.out.println("Enter the radius of the Cylinder :: ");
            cylinderradius = sc.nextDouble();

            System.out.println("Enter the height of the Cylinder :: ");
            cylinderheight = sc.nextDouble();
        }

        System.out.println();
    }

    void dispvolume(){
        double volumesphere, volumecylinder;

        volumesphere = (4.0/3.0) * Math.PI * Math.pow(sphereradius, 3);

        volumecylinder = Math.PI * Math.pow(cylinderradius, 2) * cylinderheight;

        System.out.println("The volume of the sphere is :: " + volumesphere);

        System.out.println();

        System.out.println("The volume of the cylinder is :: " + volumecylinder);
    }
}

public class REC_13_VolSpCy {
    
    public static void main(String[] args) {
        
        Vol_3D volume = new Vol_3D();

        volume.readdata();

        System.out.println();

        volume.dispvolume();
    }
}
