class A
{
    public A()
    {
        System.out.println("This is A");
    }
    public A(int a)
    {
        System.out.println("This is int A");
    }
}

class B extends A
{
    public B()
    {
        //.super() it automatically calls constructor of super class
        super(5); //. It will call parameterrised constructor of class A
        System.out.println("This is B");
    }
    public B(int b)
    {
        this(); //. It will call constructor of it own class
        System.out.println("This is int B");
    }
}
public class a9_this_super
{
    public static void main(String[] args) {
        B obj = new B();
        B obj1 = new B(5);
    }
}