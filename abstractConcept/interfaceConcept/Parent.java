package abstractConcept.interfaceConcept;
@FunctionalInterface
interface Parent {
    void greets();
    static void name(){
        System.out.println("Hey whats your name ");
    }
    default void walk(){
        System.out.println("Parents going for walk ");
    }
}
class Child implements Parent{
    @Override
    public void greets(){
        System.out.println("Good Morning");
    }
}
class Test2{
    public static void main(String[] args) {
        Parent p=new Child();
        p.greets();
        p.walk();
        Parent.name();
    }
}