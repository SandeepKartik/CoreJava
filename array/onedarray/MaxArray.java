package array.onedarray;

public class MaxArray {
    public static void main(String[] args) {
        int[]arr={12,45,7,98,34};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The Maximum Array = "+max);
    }
    
}
