class Mobile
{
    String brand;
    int price;
    //-> Static makes that variable common for all the objects
    //@ Change in any object reflect in all the objects
    static String name;

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class a2_static_variable
{
    public static void main(String a[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Nokia";
        obj1.price = 1500;
        Mobile.name = "SmartPhone"; //. obj2.name = "SmartPhone";
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsumg";
        obj2.price = 1300;

        obj1.show();
        obj2.show();

    }
}