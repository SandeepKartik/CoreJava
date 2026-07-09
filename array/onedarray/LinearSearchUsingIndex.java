package array.onedarray;

public class LinearSearchUsingIndex {
    public static void main(String[] args) {
        int [] arr={10,20,21,33,34,56,78,90,91,100};
        int index=0;
        int key=33;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==key){
                index+=i;
                break;
            } 

        }
        if(index !=-1){
            System.out.println("The number found at index "+index+" the number is "+key);
        }
       
    }
    
}
