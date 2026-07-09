package array.onedarray;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr={10,20,33,44,55,60,70,98,99};
        int [] reverse=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            reverse[j]=arr[i];
            j++;
        }
        for(int k=reverse.length-1;k>=0;k--){
            System.out.println("The reverse Array : "+reverse[k]);
        }
    }
    
}
