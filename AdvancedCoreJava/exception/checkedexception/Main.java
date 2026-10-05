package AdvancedCoreJava.exception.checkedexception;
import java.io.FileReader;
public class Main {
    public static void main(String[] args) {
        try{
            FileReader f=new FileReader("data.txt");
        }catch(Exception e){
            System.out.println("File problem......");
        }
    }
    
}
