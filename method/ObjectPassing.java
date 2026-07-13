package method;

public class ObjectPassing {
    String name;
    int age;    
}
class ObjectMaking{
    void call(ObjectPassing st){
        st.name="kartik";
        st.age=27;
    }
    public static void main(String[] args) {
        ObjectPassing op=new ObjectPassing();
        ObjectMaking om=new ObjectMaking();
        String name="Sam ";
        int age=26;
        om.call(op);
        System.out.println(op.name);
        System.out.println(op.age);
    }
}