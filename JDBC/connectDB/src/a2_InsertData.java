import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class a2_InsertData {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String name = "root";
        String password = "8389861365";

        String query = "INSERT INTO students (name, roll) VALUES (?, ?)";
        
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, name, password);
        PreparedStatement st = con.prepareStatement(query);

        st.setString(1, "Aditya");
        st.setInt(2, 3);

        int count = st.executeUpdate(); //# It will give the affected rows

        System.out.println(count);

        st.close();
        con.close();
    }
}
