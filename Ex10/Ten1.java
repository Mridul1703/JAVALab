import java.sql.*;

public class Ten1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/students", "root", "MySQLJDBC");
            Statement st = con.createStatement();

            String sql = "CREATE TABLE 'students'.'tenone' ( 
                'Name' VARCHAR(20) NOT NULL, 
                'empcode' DOUBLE NULL )";
                
            st.executeUpdate(sql);

            st.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}