import java.util.Scanner;

public class Swap1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = input.nextInt();

        int temp = num;
        num = sum;
        sum = temp;
        System.out.println(sum);
    }

    
}
