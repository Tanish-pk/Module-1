public class count{
    public static void main(String[]args){
        int[]arr={18,23,500,345,65,78};
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>50){
                count++;
            }
        }
        System.out.println("numbers greater than 50: "+count);
    }
}