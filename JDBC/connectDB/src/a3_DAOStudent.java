import java.sql.*;

public class a3_DAOStudent {
    public static void main(String[] args) {
        OperationsStudents op = new OperationsStudents();

        // String stud = op.getStudentsNameByRoll(1);
        // System.out.println(stud);

        op.getAllStudents();
        
        // System.out.println(op.addStudent("SS", 11));
        // System.out.println(op.deleteStudent(11));


    }
}

class Student{
    public String name;
    public int roll;

    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
}

class OperationsStudents {

    private Connection con = null;
    
    private void connect(){
        String url = "jdbc:mysql://localhost:3306/mydb";
        String uName = "root";
        String pass = "8389861365";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Load Exception: " + e);
        }

        try {

            con = DriverManager.getConnection(url , uName, pass);

        } catch (SQLException e) {
            System.out.println("SQL Connection: " + e);
        }
    }

    public String getStudentsNameByRoll(int roll){
        
        String query = "SELECT name from students where roll=" + roll;
        String name = "";
        boolean get = false;

        connect();

        try {
            Statement st = con.createStatement();
            st.executeQuery(query);

            ResultSet rs = st.getResultSet();
            
            if(rs.next()){
                name = rs.getString("name");
                get = true;
            }

            st.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("SQL Querry Error: " + e);
        }


        return get ? "Roll: " + roll + ", Name: " + name : "Sudent not found";
    }

    public void getAllStudents(){
        
        String query = "SELECT * FROM students";

        String name = "";
        int roll = 0;

        connect();

        try {
            Statement st = con.createStatement();
            st.executeQuery(query);

            ResultSet rs = st.getResultSet();
            
            while(rs.next()){
                name = rs.getString("name");
                roll = rs.getInt("roll");

                System.out.println("Roll: " + roll + " , Name: " + name);
            }

            st.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("SQL Querry Error: " + e);
        }
    }

    public boolean addStudent(String name, int roll){
        String query = "INSERT INTO students (name, roll) VALUES (?, ?)";

        connect();

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, roll);

            int cnt = ps.executeUpdate();

            ps.close();
            con.close();

            return cnt==1;
            
        } catch (SQLException e) {
             System.out.println("SQL Querry Error: " + e);
        }

        return false;

    }

    public boolean deleteStudent(int roll){
        String query = "DELETE FROM students WHERE roll = ?";

        connect();

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, roll);

            int cnt = ps.executeUpdate();

            ps.close();
            con.close();

            return cnt==1;
            
        } catch (SQLException e) {
             System.out.println("SQL Querry Error: " + e);
        }

        return false;
    }
}
