package input_output.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputByStringBuffer {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your id : ");
        int id=Integer.parseInt(br.readLine());
        System.out.print("Enter m/f : ");
        char sex=br.readLine().charAt(0);
        System.out.print("Enter your name : ");
        String name = br.readLine();
        System.out.println("You have entered : ");
        System.out.println(id);
        System.out.println(sex);
        System.out.println(name);

    }
    
}
