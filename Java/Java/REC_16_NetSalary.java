package Java;

import java.util.Scanner;

class Salary{
    int empid;
    String name, designation, dept;

    public Salary(int empid, String name, String designation, String dept){
        this.empid = empid;
        this.name = name;
        this.designation = designation;
        this.dept = dept;
    }

    void DisplayEmployeeDetails(){
        System.out.println("Employee ID :: " + empid);
        System.out.println("Name :: " + name);
        System.out.println("Designation :: " + designation);
        System.out.println("Department :: " + dept);
    }
}

class Salary_1 extends Salary{
    double basic, hra, da, allowance, pf;

    public Salary_1(int empid, String name, String designation, String dept, double basic){
        super(empid, name, designation, dept);
        this.basic = basic;
        this.hra = 1250;
        this.da = 1.10*basic;
        this.allowance = 0.35*basic;
        this.pf = 0.12*basic;
    }

    public double ComputeNetSalary(){
        return (basic + hra + da + allowance - pf);
    }

    public void DisplaySalaryDetails(){
        DisplayEmployeeDetails();
        System.out.println("Basic Salary :: " + basic);
        System.out.println("HRA :: " + hra);
        System.out.println("DA :: " + da);
        System.out.println("PF :: " + pf);
        System.out.println("Net Salary :: " + ComputeNetSalary());
    }
}

public class REC_16_NetSalary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID :: ");
        int empid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Employee Name :: ");
        String name = sc.nextLine();

        System.out.println("Enter Employee Designation :: ");
        String designation = sc.nextLine();

        System.out.println("Enter Employee Department :: ");
        String dept = sc.nextLine();

        System.out.println("Enter Employee Basic Salary :: ");
        double basic = sc.nextDouble();

        Salary_1 emp = new Salary_1(empid, name, designation, dept, basic);
        emp.DisplaySalaryDetails();

        sc.close();
    }
}
