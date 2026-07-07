package accessModifiers;

public class PublicAccessModifiers {
    /*A public access modifiers are that modifiers which most accessible and lest 
    restricted modifiers which is access by referance/object or class visibility  */
    public int num=1212;
    public void show(){
        System.out.println(num);
    }
    
}
class test{
    public static void main(String [] args){
        PublicAccessModifiers pm=new PublicAccessModifiers();
        pm.show();
        System.out.println(pm.num);

    }
}
