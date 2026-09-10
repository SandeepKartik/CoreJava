package AdvancedCoreJava.generics.genericinterface;

interface Storage<T> {
    void store(T data);
    T retrive();
    
}
class Mystorage<T> implements Storage<T>{
    T data;
    @Override 
    public void store(T data){
        this.data=data;

    }
    @Override 
    public T retrive(){
        return (data);
    }
}
class Main{
    public static void main(String[] args) {
        Mystorage<String> s=new Mystorage<>();
        s.store("Sam kartik");
        String result=s.retrive();
        System.out.println(result);
    }
}
