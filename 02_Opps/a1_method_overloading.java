class Calculator
{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
}

public class a1_method_overloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int add1 = cal.add(2, 2);
        int add2 = cal.add(5, 5, 5);

        System.out.println(add1);
        System.out.println(add2);
    }
}
