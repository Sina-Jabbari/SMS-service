package lab3.Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lab3.Helper.UserInfo;
import lab3.Helper.BookBorrowed;
import lab3.Helper.AccountInfo;

public class User_CRUD {

    private static Connection getCon() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SMS?autoReconnect=true&useSSL=false", "root", "student");
            System.out.println("Connection established.");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    public static UserInfo read(String username, String password) {
        UserInfo bean = null;
        try {
            Connection con = getCon();
            
            String query = "SELECT * FROM USER WHERE username LIKE " + username;    //query
            PreparedStatement ps = con.prepareStatement(query);                     //
            ResultSet rs = ps.executeQuery();                                       //execute query
            
            if (rs.next()) {
                String pass = rs.getString("password");

                if (pass.equals(password)) {
                    bean = new UserInfo (username, password);
                    }
                }
            con.close();
            } catch (Exception e) {System.out.println(e);}

            
            return bean;    
    }
}
