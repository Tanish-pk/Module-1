import java.util.*;

public class str {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "hello";

        System.out.println(a);                     
        System.out.println(a.toUpperCase());        
        System.out.println(a.toLowerCase());        
        System.out.println(a.length());             
        System.out.println(a.charAt(0));            

        if (a.equals(b)) {
            System.out.println("Both the strings are equal");
        } else {
            System.out.println("They are not equal");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 strings: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.equals(s2)) {
            System.out.println("entered strings are equal");
        } else {
            System.out.println("entered strings are not equal");
        }
        sc.close();

        
    }
}