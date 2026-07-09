package array.onedarray;

public class ArrayEquality {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        int [] arr1={10,20,30,40,50};
        boolean same=true;
        if(arr.length !=arr1.length){
            same=false;
        }else{
            for(int i=0;i<arr.length;i++){
                if(arr[i] !=arr[i]){
                    same=false;
                    break;
                }
            }
        }
        if(same){
            System.out.println("Equal Array");
        }else{
            System.out.println("Not Equal Array");
        }
    }
    
}
