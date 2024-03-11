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
import lab3.GUI.Login;
import lab3.Business.View;
import lab3.Business.Message;

public class Profile_CRUD {

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

    public static AccountInfo read(String username, String post, int userid) {
        AccountInfo bean = null;
        try {
            Connection con = getCon();
            
            String query = "SELECT * FROM Profile ORDER BY postid";                 //query
            PreparedStatement ps = con.prepareStatement(query);                     //
            ResultSet rs = ps.executeQuery();                                       //execute query
            
            if (rs.next()) {
                String upost = rs.getString("post");
                String id = rs.getString("userid");
                //String pdate = 0000-00-00;

                if (id.equals(userid)) {
                    bean = new AccountInfo (username, post);
                    }
                }
            con.close();
            } catch (Exception e) {System.out.println(e);}

            
            return bean;    
    }
}
