package AdvancedCoreJava.serialization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Student implements Serializable{
    int id;
    String name;
    Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
    }
    
}
class Main{
    public static void main(String[] args) throws Exception {
        Student s=new Student(101, "Sam Kartik..");
        FileOutputStream fos=new FileOutputStream("student.ser");// connect file object to outpur stream 
        ObjectOutputStream oss=new ObjectOutputStream(fos);// Object ko out put stream se connect krna 
        oss.writeObject(s);// serialization is done here 
        fos.close();
        oss.close();
        System.out.println("The Serialization in successfully ...");
    }
}
