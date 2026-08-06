package AdvancedCoreJava;

public class POJOExample {
    private String name;
    private int age;
    public POJOExample(){}
    public POJOExample(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    /*public void display(){
        System.out.println("Your name is : "+name);
        System.out.println("Your age is : "+age);
    }*/
}
class Main{
    public static void main(String[] args) {
        var p=new POJOExample();
        p.setName("Sam kartik ");
        p.setAge(26);
        System.out.println( p.getName());
        System.out.println(p.getAge());
        System.out.println(p);
        
    }
}