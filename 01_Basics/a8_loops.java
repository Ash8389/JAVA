public class a8_loops {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 5) {
            System.out.println("WHILE LOOP!!!");
            i++;
        }

        do {
            System.out.println("DO WHILE LOOP!!!");
            i++;
        } while (i <= 10);

        for (int j = 1; j <= 5; j++) {
            System.out.println("FOR LOOP!!!");
        }

        System.out.println("Program runs successfully.");
    }
}
