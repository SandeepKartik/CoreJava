public class ArrayReturn {
    int[] createArray(){
        int[] arr={10,20,30,40};
        arr[0]=100;
        return arr;
    }
    public static void main(String[] args) {
        ArrayReturn ar=new ArrayReturn();
        int[] result=ar.createArray();
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
    
}
