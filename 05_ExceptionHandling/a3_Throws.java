
class A
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("This");
    }
}

public class a3_Throws {
    public static void main(String[] args) {
        A obj = new A();

        try {
            obj.show();
        }
        catch(ClassNotFoundException e) {
            System.out.println("This class not found");
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
