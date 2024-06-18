import java.util.Scanner;

public class multipleof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0) {
            System.out.println("The number " + num + " is a multiple of 3.");
        } else {
            System.out.println("The number " + num + " is not a multiple of 3.");
        }

        
    }
}
