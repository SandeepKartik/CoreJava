package encapsulation;

public final class Student1 {
    private  final String name;
    private final int age;
   Student1(String name,int age){
        this.name=name;
        if(age>=18){
            this.age=age;
        }else{
            this.age=18;
        }

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
}
class Test2{
    public static void main(String[] args) {
        Student1 s=new Student1("Sam kartik", 19);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
