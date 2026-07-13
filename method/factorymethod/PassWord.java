package factorymethod;

public class PassWord {
    String username;
    int password;
    PassWord(int password,String username){
        this.password=password;
        this.username=username;
    }
    static PassWord create(String username){
        return new PassWord(12345,username);
    }
    void show(){
        System.out.println(password);
        System.out.println(username);
    }
    public static void main(String[] args) {
        PassWord p=PassWord.create("Sam");
        p.show();
    }
}
