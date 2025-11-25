
interface A
{
    //. variables in interface are final ans static automatically
    int n1 = 5;
    String str = "AS";

    public void show();
    
}
interface X {
    public void config();
}
class B implements A, X
{
    public void show(){
        System.out.println("Show Implemented");
    }
    public void config(){
        System.out.println("In config");
    }
}
public class a20_AboutInterface {
    public static void main(String[] args) {
        A obj1 = new B();
        obj1.show();

        X obj2 = new B();
        obj2.config();

        System.out.println(A.str);
    }
}
