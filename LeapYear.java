import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Leap year calculator: ");
        System.out.print("Please enter a year that you want to cheack: ");
        int year = input.nextInt();

        if (year % 400 == 0 && year % 100 != 0 || year % 4 == 0) {
            System.out.println("Your year is a leap year ");
            
        }
        else{
            System.out.println("Your year is a not leap year");
        }
    }
    
}
