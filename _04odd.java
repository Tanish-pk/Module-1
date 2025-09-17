//4. Given an array, print only the odd numbers.

public class _04odd {
    public static void main(String[] args) {
        int[] odd={15,03,27,28,267};
        for(int i =0;i<odd.length;i++){
            if(odd[i]%2 != 0){

                System.out.println(odd[i]);
            }
        }
    }
}
