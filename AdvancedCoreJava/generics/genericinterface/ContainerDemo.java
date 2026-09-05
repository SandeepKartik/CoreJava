package AdvancedCoreJava.generics.genericinterface;

interface  ContainerDemo<T> {
    void add(T a,T b);
    T getValue();
    
}
class IntegerContainer implements ContainerDemo<Integer>{
    private Integer a;
    private Integer b;
    @Override
    public void add(Integer a,Integer b){
        this.a=a;
        this.b=b;
        
    }
    @Override 
    public Integer getValue(){
        return a+b;
    }
}
class Test{
    public static void main(String[] args) {
        IntegerContainer ic=new IntegerContainer();
        ic.add(10,10);
        Integer num=ic.getValue();
        System.out.println("Addition is : "+num);
    }
}
