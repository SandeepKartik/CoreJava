package AdvancedCoreJava.generics.genericinterface;
/**
 * Container
 */
public interface Container<T> {
    void add(T value);
     T get();  
}
class StringContainer implements Container<String>{
    private String value;
    @Override
    public void add(String value){
        this.value=value;
    } 
    @Override
    public String get(){
        return value;
    }
}
class Main{
    public static void main(String[] args) {
        StringContainer sc=new StringContainer();
        sc.add("Sam kartik");
        String name=sc.get();
        System.out.println(name);
    }
}