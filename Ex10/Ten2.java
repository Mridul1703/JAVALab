import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.Query;
import java.sql.*;

public class Ten2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/students", "root", "MySQLJDBC");
            Statement s = cn.createStatement();
            ResultSet r = s.executeQuery("select * from students.tenone");

            // int i = s.executeUpdate("insert into students.tenone values ('Ajay', 1727)");

            while(r.next()) {
                String in = r.getString(1) + " " + r.getFloat(2);
                System.out.println(in); 
            }

            cn.close();
            r.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
