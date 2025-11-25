class A
{
    public void show1(){
        System.out.println("In show A");
    }
}
class B extends A
{
    public void show2(){
        System.out.println("In show B");
    }

}
public class a15_Upcasting_and_Downcasting {
    public static void main(String[] args) {
        // A obj = (A) new B(); //. This is upCasting

        A obj = new B();

        B obj1 = (B) obj; //. This is downCasting
        obj1.show2();
    }
}
