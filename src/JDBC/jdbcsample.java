package JDBC;
import java.sql.*;
public class jdbcsample {
    public static void main(String[] args) throws Exception {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/college";
            String name = "root";
            String pwd = "_Janaki75";
            Connection con = DriverManager.getConnection(url,name,pwd);
            Statement st = con.createStatement();
            String query1= "INSERT INTO student1 VALUES(1,102)";
            st.executeUpdate(query1);
            con.close();
            System.out.println("Data Inserted");

    }
}
