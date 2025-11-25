class demo
{
    static int a = 5;
    public int b;

    public static void show(demo obj)
    {
        System.out.println("This is a static method.");
        System.out.println("Value of a is: " + a);
        // System.out.println("Value of b is: " + b); //! We can't do this because static method is not is of any specific object.
        System.out.println("Value of b is: " + obj.b); //. We can do this

    }

}

public class a4_static_method {
    public static void main(String[] args) {
        demo d1 = new demo();
        d1.b = 30;

        demo.show(d1); //.We can call it without object directly with class_name.method_name


    }
}
