import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter number:  ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num == 2) {
            System.out.println("is Prime Number");
        }else{
             for(int i = 2; i <= num-1; i++){
        if (num % i == 0) {
            isPrime = false;
        }
       }
       if (isPrime == true) {
        System.out.println("is Prime Number");
       }else{
        System.out.println("not a Prime number");
       }
        }
      
    }
}
