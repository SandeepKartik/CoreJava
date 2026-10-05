package AdvancedCoreJava.exception.customexception;
 class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class CustomeExceptionDemo {
    static  void checkAge(int age) throws InvalidAgeException{
        if (age<=18)throw new InvalidAgeException("Age must be 18 or gratter");
    }
   // System.out.println("Eligible for voating ");

    public static void main(String[] args) {
        try{
            checkAge(15);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }    
}

