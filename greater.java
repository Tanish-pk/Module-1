//taking 2 number as input from user and print the greater number 
import java.util.*;
public class greater {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);


        //taking input of 2 number 
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int num2=sc.nextInt();

        if(num1>num2) {
            System.out.println("The greater number is : "+num1);

        }

        else if(num2>num1) {
            System.out.println("The greater number is : "+num2);

        }
        else {
            System.out.println("Both numbers are equal");
        }

    }
}

