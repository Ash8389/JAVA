class demo
{
    //-> It called once only when class is load and it happens only once.
    //-> Static blocked called before the constructor is called beacuse, it called when class is load when happens before object creation
    static
    {
        System.out.println("This is static block");
    }

    //-> It called every time when object is created.
    demo()
    {
        System.out.println("This is constructor.");
    }
}

public class a3_static_block {
    public static void main(String[] args) {
        demo obj1 = new demo();
        demo obj2 = new demo();
    }
}
