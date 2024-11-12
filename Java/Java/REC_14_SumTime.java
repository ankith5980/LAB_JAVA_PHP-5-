package Java;

import java.util.Scanner;

class Time {
    int hh; // Hours
    int mm; // Minutes
    int ss; // Seconds

    // Constructor to initialize time
    Time(int hh, int mm, int ss) {
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }

    // Function to add two time intervals
    Time addTime(Time t) {
        Time result = new Time(0, 0, 0);
        
        result.ss = this.ss + t.ss;
        result.mm = this.mm + t.mm + result.ss / 60;
        result.ss = result.ss % 60;
        
        result.hh = this.hh + t.hh + result.mm / 60;
        result.mm = result.mm % 60;
        
        return result;
    }

    // Function to display the time
    void displayTime() {
        System.out.println(this.hh + " hours " + this.mm + " minutes " + this.ss + " seconds");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first time interval
        System.out.println("Enter the first time interval:");
        System.out.print("Hours: ");
        int hh1 = sc.nextInt();
        System.out.print("Minutes: ");
        int mm1 = sc.nextInt();
        System.out.print("Seconds: ");
        int ss1 = sc.nextInt();

        System.out.println();

        // Input for second time interval
        System.out.println("Enter the second time interval:");
        System.out.print("Hours: ");
        int hh2 = sc.nextInt();
        System.out.print("Minutes: ");
        int mm2 = sc.nextInt();
        System.out.print("Seconds: ");
        int ss2 = sc.nextInt();

        System.out.println();

        // Create two Time objects with user-defined input
        Time time1 = new Time(hh1, mm1, ss1);
        Time time2 = new Time(hh2, mm2, ss2);

        // Add the two time intervals
        Time sum = time1.addTime(time2);

        // Display the result
        System.out.print("Sum of time intervals: ");
        sum.displayTime();

        sc.close();
    }
}
