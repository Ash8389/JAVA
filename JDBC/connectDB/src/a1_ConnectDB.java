import java.sql.*;


public class a1_ConnectDB {
    public static void main(String []args) {

        String userName = "root";
        String password = "8389861365";
        String url = "jdbc:mysql://localhost:3306/mydb";

        String query = "SELECT * from students";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("DB connection error: " + e);
        }

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection(url, userName, password);
            st  = con.createStatement();

            st.executeQuery(query);
            
            rs =  st.getResultSet();
            
            while(rs.next()){

                String name = rs.getString("name");
                int roll = rs.getInt("roll");
    
                System.out.println(name + " " + roll);
            }

            st.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Connection Error: " + e);
        }
    }    
}
