package encapsulation;

public class Student {
    private String name;
    private int rollNo;
    private int marks;
    public void setName(String name){
        this.name=name;
    }
    public void setRollNo(int rollNo){
        if(rollNo>0){
            this.rollNo=rollNo;
        }
    }
    public void setMarks(int marks){
        if(marks>0){
            this.marks=marks;
        }
    }
    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public int getMarks(){
        return marks;
    }
    
}
class Test{
    public static void main(String[] args) {
        Student st=new Student();
        st.setName("Sam kartik");
        st.setMarks(10);
        st.setRollNo(1);
        System.out.println(st.getName());
        System.out.println(st.getRollNo());
        System.out.println(st.getMarks());
    }
}
