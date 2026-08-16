package AdvancedCoreJava.serialization;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.Serializable;

public class Animal implements Serializable {
    private static final long serialVersionUID=1L;
    int id;
    String name;
    Animal(int id,String name){
        this.id=id;
        this.name=name;

    }
    
}
class Main1{
    public static void main(String[] args) throws Exception {
        Animal a=new Animal(101, "dog");
        FileOutputStream fos=new FileOutputStream("a.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a);
        oos.close();
        fos.close();
        System.out.println("Serialization Sucessfull...");
        //Deserialization
        FileInputStream fis=new FileInputStream("a.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Animal restore=(Animal) ois.readObject();
        System.out.println(restore.id);
        System.out.println(restore.name);
        fis.close();
        ois.close();
        System.out.println("Deserialization completed...");
    }
}
