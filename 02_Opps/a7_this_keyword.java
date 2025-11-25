
class demo{
    private int age;

    //->this gives the reference of the current object., otherwise it will save the value to the local variable.
    public void setAge(int age){
        this.age = age;
    } 
}
public class a7_this_keyword {
    public static void main(String[] args) {
        demo obj = new demo();

        obj.setAge(24);
    }
}
