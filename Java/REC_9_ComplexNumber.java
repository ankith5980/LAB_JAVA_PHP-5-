package Java;

import java.util.Scanner;

public class REC_9_ComplexNumber {
    double real;
    double imaginary;

    REC_9_ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    REC_9_ComplexNumber add(REC_9_ComplexNumber other){
        return new REC_9_ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    void display(){
        System.out.println("Sum :: " + this.real + " " + " + " + " " + this.imaginary + "i");
    }
}

class REC_9_ComplexNumberSum extends REC_9_ComplexNumber{

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first complex number (real imaginary) :: ");
            REC_9_ComplexNumber num1 = new REC_9_ComplexNumber(sc.nextDouble(), sc.nextDouble());

            System.out.println("Enter the second complex number (real imagnary) :: ");
            REC_9_ComplexNumber num2 = new REC_9_ComplexNumber(sc.nextDouble(), sc.nextDouble());

            REC_9_ComplexNumber sum = num1.add(num2);

            sum.display();
        }
    }

   public REC_9_ComplexNumberSum(double real, double imaginary){
        super(real, imaginary);
    }
}