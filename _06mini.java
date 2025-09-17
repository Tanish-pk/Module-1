//6. Find the minimum element in the array.

public class _06mini {
    public static void main(String[] args) {
        int[] mi={99,34,32,1,3,34};
        int mini=mi[0];
        for(int i=0;i<mi.length;i++){
            if(mi[i]<mini) {
                mini=mi[i];
            }
        }
        System.out.println("Minimum Element : "+mini);
    }
}
