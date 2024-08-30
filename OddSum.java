import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to oddsum calc: ");
        System.out.println("Enter the first number: ");
        int num = input.nextInt();
        int sum = OddSum(num);
        System.out.println(sum);

    }

    public static int OddSum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
          sum += i;
          i += 2;

        }

        return sum;

    }

}
