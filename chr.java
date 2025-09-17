//take string as input and print the first and last character using charAt() function
import java.util.Scanner;
public class chr {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        str=sc.nextLine();
        System.out.println("The first character : "+str.charAt(0));
        System.out.println("Last character : "+str.charAt(str.length()-1));
    }
    
    
}
