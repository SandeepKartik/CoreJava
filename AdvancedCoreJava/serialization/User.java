package AdvancedCoreJava.serialization;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.Serializable;
public class User implements Serializable {
    String userName ;
    transient String password;
    User(String userName,String password){
        this.userName=userName;
        this.password=password;
    }
    
}
class Test{
    public static void main(String[] args) throws Exception{
        //object
        User u=new User("Sam", "Secret12345");
        //Serialiazation
        FileOutputStream fos=new FileOutputStream("u.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(u);
        fos.close();
        oos.close();
        System.out.println("Serialiazation successful..");
        //Deserialization
        FileInputStream fis=new FileInputStream("u.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        User restore=(User) ois.readObject();
        System.out.println(restore.userName);
        System.out.println(restore.password);
        System.out.println("DeSerialization is sucessful....");
    }
}
