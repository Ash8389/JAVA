
class A
{
    public void show()
    {
        System.out.println("This is show");
    }

    class B
    {
        public void config()
        {
            System.out.println("This is config");
        }
    }

    static class C
    {
        public void funcC()
        {
            System.out.println("Thid is a function of C.");
        }
    }
}
public class a18_NestedClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();


        A.B obj1 = obj.new B();
        obj1.config();

        A.C obj2 = new A.C();
        obj2.funcC();
    }
}
