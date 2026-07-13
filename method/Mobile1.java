public class Mobile1 {
    String brand;
    int price;
    Mobile1 setBrand(String brand){
        this.brand=brand;
        return this;
    }
    Mobile1 setPrice(int price){
        this.price=price;
        return this;
    }
    void show(){
        System.out.println(brand);
        System.out.println(price);
    }
    public static void main(String[] args) {
        Mobile1 m=new Mobile1();
        m.setBrand("Apple").setPrice(550000).show();
    }
    
}
