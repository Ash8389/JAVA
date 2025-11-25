class Details
{
    String name;
    private int age;
    private String email;
    private String phone_no;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone_no() {
        return phone_no;
    }
    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }
}

public class a5_encapsulation {
    public static void main(String[] args) {
        Details d1 = new Details();

        d1.name = "Ashish";
        d1.setAge(24);
        d1.setEmail("jhaashish270@gmail.com");
        d1.setPhone_no("+91 79922 63219");

        String name = d1.getName();
        int age = d1.getAge();
        String email = d1.getEmail();
        String phone_no = d1.getPhone_no();

        System.out.println("Name : " + name + "\nAge : " + age + "\nEmail : " + email + "\nPhone No.: " + phone_no);
    }    
}
