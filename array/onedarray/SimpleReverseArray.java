package array.onedarray;

public class SimpleReverseArray {
    public static void main(String[] args) {
        int [] arr={10,20,33,44,56,76,89,97};
        int reverse [] =new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            reverse[j]=arr[i];
            j++;
        }
        for(int num : reverse){
            System.out.println(num +"= ");
        }
    }
    
}
