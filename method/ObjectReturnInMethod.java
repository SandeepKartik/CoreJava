package method;

public class ObjectReturnInMethod {
    String name;

    
}
class Demo5{
    ObjectPassingIntoMethod createObjectPass(){
        ObjectPassingIntoMethod s=new ObjectPassingIntoMethod();
        s.name="Sam";
        return s;
    }
    public static void main(String[] args) {
        Demo5 d=new Demo5();
        ObjectPassingIntoMethod st=d.createObjectPass();
        System.out.println(st.name);

    }


}