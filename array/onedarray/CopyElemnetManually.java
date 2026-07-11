package array.onedarray;

public class CopyElemnetManually {
    public static void main(String[] args) {
        int arr []=new int[]{10,30,40,50,60,76,89,100};
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr[i];
        }
        for(int num :arr1){
            System.out.println(num +" ");
        }
        arr1[0]=45;
        System.out.println("After Change : ");
        for(int num1 :arr1){
            System.out.println(num1);
        }
    }
    
}
