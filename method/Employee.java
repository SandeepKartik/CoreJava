public class Employee {
    String name;
    int Sallery;

    
}
class Calculate{
    void employee(Employee e){
        e.name="Sam Kartik";
        e.Sallery=500000;
    }
    public static void main(String[] args) {
        Employee em=new Employee();
        Calculate c=new Calculate();
        String name ="Samk ";
        int sallery=540000;
        c.employee(em);
        System.out.println(em.name);
        System.out.println(em.Sallery);
    }
}