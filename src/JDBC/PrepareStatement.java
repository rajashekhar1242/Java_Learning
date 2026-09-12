package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareStatement {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://127.0.0.1:3306/college";
        String user="root";
        String password="#";
        Connection con= DriverManager.getConnection(url,user,password);

        int id=109;
        String name="Shrav";
        String query="update student set full_name=? where id=?";

        //using PreparedStatement Interface
        PreparedStatement st=con.prepareStatement(query);
        st.setString(1,name);
        st.setInt(2,id);
        System.out.println(st.executeUpdate());



    }

}
