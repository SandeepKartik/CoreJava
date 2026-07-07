package accessModifiers;

public class AccessModifiersExample {
    
        /*Access Modifiers are essential keywords that define the 
        scope and visibility of classes, methods, constructors, and variables */
       public  String name="Sam";
        private int accountBlance=10000;

        public   void display(){
            System.out.println(name);
            System.out.println(accountBlance);

        }
      public static void main(String[] args) {
        AccessModifiersExample ac=new AccessModifiersExample();
        ac.display();
        System.out.println(ac.accountBlance); // call becouse it in same class 
      }
    
}
