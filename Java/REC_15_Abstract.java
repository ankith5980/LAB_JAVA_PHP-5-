package Java;

import java.util.Scanner;

abstract class Shape{

}
abstract class TwoD extends Shape{

}
abstract class ThreeD extends Shape{

}

class Square extends TwoD{
    private double side;
    Square(double side){
        this.side = side;
    }
    double area(){
        return side*side;
    }
}

class Triangle extends TwoD{
    private double base;
    private double height;
    Triangle (double base, double height){
        this.base = base;
        this.height = height;
    }
    double area(){
        return 0.5*base*height;
    }
}

class Cube extends ThreeD{
    private double side;
    Cube (double side){
        this.side = side;
    }
    double SurfaceArea(){
        return 6*side*side;
    }
}

class Sphere extends ThreeD{
    private double radius;
    Sphere(double radius){
        this.radius = radius;
    }
    double SurfaceArea(){
        return 4*Math.PI*radius*radius;
    }
}

public class REC_15_Abstract{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the side length of the Square :: ");
            double SquareSide = sc.nextDouble();
            Square sq = new Square(SquareSide);
            System.out.println("Area of the square :: " + sq.area());


            System.out.println(("Enter the base and height of the triangle :: "));
            double triangleBase = sc.nextDouble();
            double triangleHeight = sc.nextDouble();
            Triangle tri = new Triangle(triangleBase, triangleHeight);
            System.out.println("Area of the Triangle :: " + tri.area());


            System.out.println("Enter the side of the cube :: ");
            double cubeSide = sc.nextDouble();
            Cube cb = new Cube(cubeSide);
            System.out.println("Area of the cube :: " + cb.SurfaceArea());


            System.out.println("Enter the radius of the sphere :: ");
            double SphereRadius = sc.nextDouble();
            Sphere sp = new Sphere(SphereRadius);
            System.out.println("Area of the Sphere :: " + sp.SurfaceArea());
            
        }
    }
}
