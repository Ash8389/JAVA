class Calculator
{
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }
}

public class a0_class
{
    public static void main(String arg[])
    {
        Calculator cal = new Calculator();
        int res = cal.add(5, 5);
        System.out.println(res);
    }
}