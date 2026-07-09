package array.onedarray;

public class MinArray {
    public static void main(String[] args) {
        int [] arr={12,34,45,7,8,20,10,98,77};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("The minimum array = "+min);
    }
    
}
