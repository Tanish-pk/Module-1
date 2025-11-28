import java.util.Scanner;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            // may throw NegativeArraySizeException
            int[] arr = new int[size];
            System.out.println("Array of size " + arr.length + " created successfully.");

            // optional: read values
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter element " + i + ": ");
                arr[i] = sc.nextInt();
            }
            System.out.print("Array contents: ");
            for (int v : arr) System.out.print(v + " ");
            System.out.println();

        } catch (NegativeArraySizeException nase) {
            System.out.println("Error: Array size cannot be negative.");
        } catch (Exception e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
