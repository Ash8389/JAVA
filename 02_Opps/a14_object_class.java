class Laptop
{
    String model;
    int price;

    public String toString()
    {
        return model + " : " + price;
    }
    public boolean equals(Laptop that)
    {
        return this.model.equals(that.model) && this.price == that.price;
    }
}

public class a14_object_class {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.price = 1000;
        obj1.model = "Vivobook";

        Laptop obj2 = new Laptop();
        obj2.model = "Vivobook";
        obj2.price = 1000;

        boolean result = obj1.equals(obj2);

        System.out.println(result);
    }
}
