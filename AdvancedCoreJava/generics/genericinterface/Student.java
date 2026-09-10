package AdvancedCoreJava.generics.genericinterface;

interface Student<T> {
    void name(T value);
    T getValue();
    
}
class StringCollector implements  Student<String>{
    private String value;
    @Override 
    public void name(String value){
        this.value=value;

    }
    @Override 
    public  String getValue(){
        return  value;
    }
}
class Main{
    public static void main(String[] args) {
        StringCollector s=new StringCollector();
        s.name("Sam kartik");
        String name=s.getValue();
        System.out.println(name);
    }
}
