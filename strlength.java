//take string as input. print its length using length () function 
import java.util.Scanner;
public class strlength {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        s=sc.nextLine();
        System.out.println("The length of the String : "+s.length());
        sc.close();

    }
}
