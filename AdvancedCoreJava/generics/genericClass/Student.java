package AdvancedCoreJava.generics.genericClass;

public class Student<T,V> {
    T key;
    V value;
    Student(T key,V value){
        this.key=key;
        this.value=value;
    }
    void print(){
        System.out.println("Key : "+key);
        System.out.println("Vlue is : "+value);
    }
    
}
class Main1{
    public static void main(String[] args) {
        Student <Integer ,String> st=new Student<>(101,"Sam Kartik ");
        st.print();
    }
}
