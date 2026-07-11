package method;

public class AddSubMul {
    int add(int a,int b){
        sub(a,b);
        return( a+b);
       
    }
    int sub(int a,int b){
          mul(a,b);
        if(a>b){
            return (a-b);
        }else{
            return (b-a);
        }
      
    }
    int mul(int a,int b){
        return(a*b);
    }
    
}
class Test3{
    public static void main(String[] args) {
        AddSubMul ad=new AddSubMul();
        System.out.println(ad.add(10,20));
        System.out.println(ad.sub(20,30));      
        System.out.println(ad.mul(10,60));
    }
}
