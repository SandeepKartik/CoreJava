public class Calculator {
    int a;
    int b;
    float result;
    Calculator setAdd(int a,int b){
        this.a=a;
        this.b=b;
        result=a+b;
        return this ;
    }
    Calculator setSub(int a,int b){
        this.a=a;
        this.b=b;
        if(a>b){
            result=a-b;
        }else{
            result=b-a;
        }
        return this;
    }
    Calculator setMul(int a,int b){
        this.a =a;
        this.b=b;
        result=a*b;
        return this;
    }
    Calculator setDiv(int a ,int b){
        this.a=a;
        this.b=b;
        if(a>b){
            result=a/b;
        }else{
            result=b/a;
        }
        return this;
    }
    Calculator show(){
        System.out.println(result);
        return this;
    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.setAdd(10, 20).setSub(20, 10).setMul(30,60).setDiv(5, 15).show();
    }

}
