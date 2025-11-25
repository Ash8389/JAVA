public class a8_inheritance {
    public static void main(String[] args) {
        AdvCalc cal = new AdvCalc();

        int sum = cal.add(5, 2);
        int sub = cal.sub(5, 2);
        int mul = cal.mul(5, 2);
        int div = cal.div(5, 2);

        System.out.println(sum + "\n" + sub + "\n" + mul + "\n" + div);
    }    
}
