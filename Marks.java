import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the MArks calc: ");
        System.out.println("Enter Marks percentage: ");
        float percentage = input.nextFloat();

        if (percentage >= 90) {
            System.out.println("You got Grade A");
        }
        else if (percentage >= 80) {
            System.out.println("You got Grade B");
        }
        else if (percentage >= 60) {
            System.out.println("You got Grade C");
        }
        else if (percentage >= 45) {
            System.out.println("You got Grade D");
        }
        else if (percentage >= 30) {
            System.out.println("You got Grade E");
        }
        else{
            System.out.println("FAiL");
        }
    }
    
}
