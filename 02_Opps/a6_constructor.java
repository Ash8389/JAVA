class demo
{
    int a;

    public demo()
    {
        System.out.println("This is a default constructor.");
    }
    public demo(int a){
        this.a = a;
        System.out.println("This is a parameterized constructor");
    }
}

public class a6_constructor {
    public static void main(String[] args) {
        demo obj = new demo();
        demo obj1 = new demo(10);
        
    }
}
