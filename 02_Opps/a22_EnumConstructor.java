enum Laptop
{
    Vivobook(1000), IdeaPad, Victus(1200), TUF(1300);

    private int price;

    private Laptop(){
        price = 500;
    }
    private Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}

public class a22_EnumConstructor {
    public static void main(String[] args) {
        // Laptop lap = Laptop.IdeaPad;

        // System.out.println(lap.getPrice());

        for(Laptop lap: Laptop.values()){
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}