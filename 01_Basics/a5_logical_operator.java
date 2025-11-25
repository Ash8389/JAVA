public class a5_logical_operator {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int x = 4;
        
        boolean res = (a<b && a==x);
        System.out.println(res);
        
        res = (a>b || a==x);
        System.out.println(res);
        
        System.out.println(!res);
    }
}
