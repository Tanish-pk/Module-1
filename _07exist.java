//check wheather the given number exists in an array or not 
import java.util.Scanner;
public class _07exist {
    public static void main(String[] args) {
        int[] no={8,6,7,0,9};
        Scanner s=new Scanner(System.in);
        System.out.print("ENter a number to search : ");
        int target=s.nextInt();
        Boolean found=false;
        for(int num:no) {
            if(num==target){
                found=true;
                break;
            }

        }
        if(found){
            System.out.println(target+ " exist in the array ");

        }
        else {
            System.out.println(target + "  not found");
        }

        

        
    }
}
