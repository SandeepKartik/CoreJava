package array.onedarray;

public class SwapArray {
    public static void main(String[] args) {
        int [] arr=new int[]{10,20,30,56,89,90,99};
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int num : arr){
            System.out.println(num);
        }
    }
    
}
