import java.util.Scanner;  // Import Scanner class for user input

public class avg {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();  
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();  
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];  
        } 
        double average = (double) sum / n;  
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);
        scanner.close();
    }
}
