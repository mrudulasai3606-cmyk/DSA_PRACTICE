package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/janaki";
        String user = "root";
        String pwd = "_Janaki75";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,user,pwd);
        Statement st = con.createStatement();
        String q1 = "INSERT INTO emp VALUES(6,'mrudula',50000)";
        st.executeUpdate(q1);
        System.out.println("Insert Successfully");
    }
}
