class Computer
{
    public void show(){
        System.out.println("This is comp");
    }
}

class Laptop extends Computer
{
    public void show(){
        System.out.println("This is Lap");
    }
}

class Desktop extends Computer
{
    public void show(){
        System.out.println("This is Desk");
    }
}

public class a12_DynamicMethodDispatch {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.show();

        obj = new Laptop(); 
        obj.show();

        obj = new Desktop();
        obj.show();
    }
}
