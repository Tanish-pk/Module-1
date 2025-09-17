//3. Given an array, print only the even numbers.
public class _03even {
    public static void main(String[] args) {
        int[] eve={2,4,7,3,18};
        for(int i =0;i<eve.length;i++){
            if(eve[i]%2==0){
                System.out.println(eve[i]);
            }
        }
    }
    
}