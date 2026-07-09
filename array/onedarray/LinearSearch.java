package array.onedarray;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={10,20,34,55,44,31,67,89,90};
        int key=34;
        boolean br=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                br=true;
                System.out.println("The number is found at index "+i+" and number is "+arr[i]);
            }
        }
    }
    
}
