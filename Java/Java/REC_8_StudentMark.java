package Java;

import java.util.Scanner;

public class REC_8_StudentMark {
    public String Name;
    public int RollNumber;

    public REC_8_StudentMark(String Name, int RollNumber){
        this.Name = Name;
        this.RollNumber = RollNumber;
    }

    public String getName(){
        return Name;
    }

    public int getRollNumber(){
        return RollNumber;
    }
}

class Mark extends REC_8_StudentMark {
    public int subject1;
    public int subject2;
    public int subject3;
    public int subject4;
    public int subject5;

    public Mark(String Name, int RollNumber, int subject1, int subject2, int subject3, int subject4, int subject5){
        super(Name, RollNumber);
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
        this.subject5 = subject5;
    }

    public double CalculateAverage(){
        return (subject1 + subject2 + subject3 + subject4 + subject5) / 5.0;
    }
}

       class StudentMark {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter student Name :: ");
            String Name = sc.nextLine();

            System.out.println("Enter the RollNumber :: ");
            int RollNumber = sc.nextInt();

            System.out.println("Enter marks for subject 1 :: ");
            int subject1 = sc.nextInt();

            System.out.println("Enter marks for subject 2 :: ");
            int subject2 = sc.nextInt();

            System.out.println("Enter marks for subject 3 :: ");
            int subject3 = sc.nextInt();

            System.out.println("Enter marks for subject 4 :: ");
            int subject4 = sc.nextInt();

            System.out.println("Enter marks for subject 5 :: ");
            int subject5 = sc.nextInt();

            Mark studentMark = new Mark(Name, RollNumber, subject1, subject2, subject3, subject4, subject5);

            double average = studentMark.CalculateAverage();

            System.out.println("\nStudent Name :: " + studentMark.getName());
            System.out.println("RollNumber :: " + studentMark.getRollNumber());
            System.out.println("Average Marks :: " + average);
        }
    }
}
