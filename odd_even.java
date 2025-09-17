//take input of a number and print whether it is even or odd
import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=s.nextInt();

        if(num%2==0) {
            System.out.println("Entered number is even ");
        }
        else {
            System.out.println("Enter number is odd");
        }
    }
    
}
