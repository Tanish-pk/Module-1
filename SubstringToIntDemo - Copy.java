import java.util.Scanner;

public class SubstringToIntDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a name/string: ");
            String s = sc.nextLine();

            // may throw StringIndexOutOfBoundsException if length < 3
            String firstThree = s.substring(0, 3);

            // may throw NumberFormatException if not numeric
            int value = Integer.parseInt(firstThree);
            System.out.println("Converted integer from first three chars: " + value);

        } catch (StringIndexOutOfBoundsException sie) {
            System.out.println("Error: Input must have at least 3 characters.");
        } catch (NumberFormatException nfe) {
            System.out.println("Error: First three characters are not a valid integer.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
