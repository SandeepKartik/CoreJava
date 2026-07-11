package array.onedarray;

public class UseOfCloneMethod {
    public static void main(String[] args) {
        int arr[] =new int[]{10,29,39,34,45,67,89,90,99};
        //int [] copy=new int[arr.length];
         int copy[]=arr.clone();
         for(int num : copy){
            System.out.println(num+" ");
         }
         System.out.println("Make change : ");
         copy[0]=99;
         for(int num1:copy){
            System.out.println(num1+" ");
         }

    }
    
}
