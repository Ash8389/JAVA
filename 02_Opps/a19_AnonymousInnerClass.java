
class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}
abstract class B
{
    abstract public void show();
    abstract public void config();
}
public class a19_AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("In new show");
            }
        };
        obj.show();

        B obj2 = new B() { //. Not creating object of class B, creating object of Anonymous Class.
            public void show(){
                System.out.println("In B show");
            }
            public void config(){
                System.out.println("In config");
            }
        };

        obj2.show();
        obj2.config();
    }
}
