
class MyException extends Exception //. We can also extends Runtime exception
{
    public MyException(String msg){
        super(msg);
    }
}

public class a2_CustomException {
    public static void main(String[] args) {
        String msg = "Seperate";
        try {
            if(msg.equals("Seperate"))
                throw new MyException("You can't be seperate");
        } catch (MyException e) {
            System.out.println(e);
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
