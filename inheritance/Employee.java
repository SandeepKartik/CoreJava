package inheritance;

public class Employee {
    String name="Sam Kartik";
    void work(){
        System.out.println("Employees are working ");
    }
    
}
class Developer extends Employee{
    void writeCode(){
        System.out.println("Developer are write code for  clints ");

    }
}
class Manager extends Employee{
    void conductMeetings(){
        System.out.println("Managger are conducts meetings : ");
    }
}
class Main1{
    public static void main(String[] args) {
        Developer d=new Developer();
        System.out.println(d.name);
        d.work();
        d.writeCode();

        Manager m=new Manager();
        System.out.println(m.name);
        m.work();
        m.conductMeetings();
    }
}