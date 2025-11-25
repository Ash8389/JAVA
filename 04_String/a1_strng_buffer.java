public class a1_strng_buffer {
    public static void main(String[] args) {

        //StringBuffer is aa mutable type of string.

        StringBuffer sb = new StringBuffer("Ashish");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("Rose");

        sb.insert(0, "Java ");

        System.out.println(sb);

        String n = sb.toString(); //-> Converting from string_buffer to String
    }
}
