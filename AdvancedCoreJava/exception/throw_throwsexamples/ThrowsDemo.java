package AdvancedCoreJava.exception.throw_throwsexamples;
import java.io.FileReader;
import java.io.IOException;
public class ThrowsDemo {
    public static void main(String[] args) throws IOException{
            readFile();
        } 
        public  static  void readFile() throws IOException{
            FileReader f=new FileReader("data.txt");
            System.out.println("File reading is succesfull .....");
        }
    }
    

