package Java;

public class REC_10_Calculator {

    public static void main(String[] args) {
        int sum, sub, pdt, div, rem;

        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers as command line arguements.");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        sum = x + y;
        sub = x - y;
        pdt = x * y;
        div = x / y;
        rem = x % y;

        System.out.println("The Sum is :: " + sum);

        System.out.println("The Difference is :: " + sub);

        System.out.println("The Prduct is :: " + pdt);

        System.out.println("The Quotient is :: " + div);

        System.out.println("The Remainder is :: " + rem);
    }    
}

//Method to get the output for the above code

/*
  1. Compile the code.
  2. Open terminal or command prompt
  3. Navigate to the directory where the program or file is located
  4. Run the command "javac REC_10_Calculator.java"
  5. Pass the two numbers as arguements using :: "java REC_10_Calculator 35 56"
 */