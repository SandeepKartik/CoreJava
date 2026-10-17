package AdvancedCoreJava.file_handling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file=new  File("student.txt");
        try{
            boolean create =file.createNewFile();
            if(create){
                System.out.println("File created successfully..");
            }else{
                System.out.println("File already created ...");
            }
            System.out.println("Name : "+file.getName());
            System.out.println("Path : "+ file.getPath());
            System.out.println("Absolute Path: "+file.getAbsolutePath());
            System.out.println("Exists : "+file.exists());
            System.out.println("Is File "+file.isFile());
            System.out.println("Is Directory "+file.isDirectory());
            System.out.println("Size "+file.length()+" bytes");
            System.out.println("Can Read "+file.canRead());
            System.out.println("Can Write "+file.canWrite());

        }catch(Exception e){
            System.out.println("File Operation failed ... "+e.getMessage());
        }
    }
    
}
