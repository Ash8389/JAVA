class A
{
    public A(){
        System.out.println("This is constructor of A");
    }

    public void show(){
        System.out.println("This is show method");
    }
}
public class a10_Anonymous_obj
{
    public static void main(String[] args) {
        new A().show(); // Anonymous Object
    }
}