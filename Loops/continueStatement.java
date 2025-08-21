import java.util.Scanner;

public class continueStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //     for(int i = 1; i <= 5; i++){
    //         if (i == 3) {
    //             continue;
    //         }
    //         System.out.println(i);
    //     }

        // Display all numbers entered by user except multiples of 10.
        do{
            System.out.print("Enter your number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
             System.out.println("number was: " + n);
            
        } while(true);

    }
}
