//Count how many numbers in the array are greater than 50.
public class _01count {
    public static void main(String[] args) {
        int[] arr={18,267,63,72};
        int count=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>50) {
                count++;
            }
        }
        System.out.println("numbers greater than 50 : "+count);
    }
}
