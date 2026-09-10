package AdvancedCoreJava.generics.genericinterface;
interface InterFaceClass<T> {
    void sum(T num);
     T getAdd();
}
class Add <T> implements InterFaceClass<T>{
    T num;
    @Override 
    public void sum(T num){
        this.num=num;

    }
    public T getAdd(){
        return  num;
    }
}
class Main4{
    public static void main(String[] args) {
        Add<Integer > st=new Add<>();
        st.sum(1000);
       Integer s= st.getAdd();
       System.out.println(s);
    }
}