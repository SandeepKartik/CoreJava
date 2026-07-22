package abstractConcept.interfaceConcept;

interface Animal {
    void sound();// internally it will be public abstartct void sound()
    int age=26;
}
class Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("Dog bark");
    }
}
class Main{
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sound();
        System.out.println(a.age);
    }
}