public class MethodChainning {
    String name;
    int age;
    
    MethodChainning setName(String name){
        this.name=name;
        return this;

    }
    MethodChainning setAge(int age){
        this.age=age;
        return this;

    }
    MethodChainning show(){
        System.out.println(name);
        System.out.println(age);
        return this;
    }
    public static void main(String[] args) {
        MethodChainning m=new MethodChainning();
        m.setName("Sam Kartik")
        .setAge(26)
        .show();
    }
    
}
