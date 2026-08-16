package AdvancedCoreJava.serialization;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream fid=new FileInputStream("student.ser");
        ObjectInputStream ois=new ObjectInputStream(fid);
        Student s=(Student) ois.readObject();
        fid.close();
        ois.close();
        System.out.println(s.id);
        System.out.println(s.name);
        s.display();
    }
    
}
