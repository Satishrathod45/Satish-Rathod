import java.util.Scanner;

public class posOrneg
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double num = sc.nextDouble();

        if (num > 0) {
            System.out.println("The number " + num + " is positive.");
        } else if (num < 0) {
            System.out.println("The number " + num + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        
    }
}
