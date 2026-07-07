package method;

public class MethodBasics {
    /*A method is a block of code that will be use for preform a specific task .
    insted of writing same code repetedly , write one and use it many time .
    it provide code reusibility , Easy to maintain, Cleaner code
    its divide into four part
    1. No Parameter No Return 
    2. No Parameter Return
    3. Parameter No return
    4.Parameter Return */

    public int sum(int a,int b){
        return a+b;
    }
    
}
class Test{
    public static void main(String[] args) {
        MethodBasics ms=new MethodBasics();
        System.out.println(ms.sum(10, 20));
    }
}
