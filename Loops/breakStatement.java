import java.util.Scanner;

public class breakStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // for(int i = 1; i <= 5; i++){
    //     if(i == 3){
    //         break;
    //     }
    //     System.out.println(i);
    // }
    // System.out.println("Its out the loop");

        //keep entering number till user enters a multiple of 10.
        do{
             System.out.print("enter a number: ");
            int i = sc.nextInt();

            if (i % 10 == 0) {
                break;
            }
            System.out.println(i);
           

        }while(true);


    }
    
}
