package accessModifiers;

public class DefaultAccessModifiers {
    int age=26;
    void show(){
        System.out.println("Age is : "+age);
    }
    
}
class Test{
    public static void main(String[] args) {
        DefaultAccessModifiers D=new DefaultAccessModifiers();
        D.show();
        System.out.println(D.age);
    }
}
