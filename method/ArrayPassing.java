public class ArrayPassing {
    void show(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        
        ArrayPassing ap=new ArrayPassing();
        int[]ar={10,20,30};
        ap.show(ar);
    }
    
}
