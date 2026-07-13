public class Mobile {
    String brand;
    int price;
}
class Display{
    Mobile toUpdate(Mobile m){
        m=new Mobile();
        m.brand="Vivo";
        m.price=190000;
        return m;

    }
    public static void main(String[] args) {
        Mobile me=new Mobile();
        me.brand="Apple";
        me.price=5400000;
        Display d=new Display();
        Mobile mm=d.toUpdate(me);
        System.out.println(mm.brand);
        System.out.println(mm.price);
        System.out.println(me.brand);
System.out.println(me.price);
    }
}
