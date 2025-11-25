
abstract class Car
{
    public abstract void drive();
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("Play music");
    }
}
abstract class WagonR extends Car //.We must have to derive every abstract method of Abstract class otherwise this class also became Abstarct class
{
    public void drive()
    {
        System.out.println("Driving..");
    }
}
class UpdatedWagonR extends WagonR
{
    public void fly()
    {
        System.out.println("Flying..");
    }
}
public class a17_AbstarctClass {

    public static void main(String[] args) {

        //-> We can't create object of Abstract class.

        // Car obj = new WagonR();
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.fly();
        obj.playMusic();
    }
}