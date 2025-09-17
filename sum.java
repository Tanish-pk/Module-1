//find a sum and average  of elements in an array 
import java.util.Scanner;
public class sum{
    public static void main(String[] args) {
        int sum=0;
        int numbers[]={1,2,3,4,5};
        for(int num : numbers) {
            sum = sum+num;

        }
        int average = sum/numbers.length;
        System.out.println("The sum of the array elements : "+sum);
        System.out.println("The average : "+average);
    }
}
    

