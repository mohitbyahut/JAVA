public class Swap {
    public static void main(String[] args) {
        int rahul = 10;
        int mohit = 15;
        System.out.println("Before swap: ");
        System.out.println("rahul:" + rahul);
        System.out.println("mohit: " + mohit);

        int temp = rahul;

        rahul = mohit;
        mohit = temp;
        System.out.println("after swap: ");
        System.out.println(temp);
        System.out.println();
    }
    
}
