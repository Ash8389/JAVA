
final class A
{
    public void show()
    {
        System.out.println("This is A show");
    }
}
// class B extends A{} //. can't inherit final class

class B
{
    public final void show()
    {
        System.out.println("This is B show");
    }
}

class C extends B
{
    // public void show() //. we can't override final method of super class
    // {
    //     System.out.println("This is C show");
    // }
}
public class a13_Final_Keyword {
    public static void main(String[] args) {
        final int num = 5;
        // num = 10; //. we can't change final variable
    }
}
