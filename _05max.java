//5. Find the maximum element in the array.

public class _05max {
    public static void main(String[] args) {
        int[] mx={28,15,03,06,27};
        int max=mx[0];
        for(int i=0 ;i<mx.length;i++){
            if(mx[i]>max){
                max=mx[i];
            }


        }
        System.out.println("maximum element : "+max);
    }

    

}
