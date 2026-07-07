package accessModifiers;

public class Test {

    public static void main(String[] args) {

        ProtectedAccessModifiers a = new ProtectedAccessModifiers();

        System.out.println(a.type);

        a.showType();
    }
}