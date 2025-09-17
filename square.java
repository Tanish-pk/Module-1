//take one number and print its square
import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int nu=s.nextInt();
        int square=nu*nu;
        System.out.println("Square of the Entered number : "+square);
    }
}
