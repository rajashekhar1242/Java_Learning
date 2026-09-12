package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deleteRecords {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://127.0.0.1:3306/college";
        String user="root";
        String password="#";
        Connection con= DriverManager.getConnection(url,user,password);
        String query="delete from student where id=110";
        Statement st=con.createStatement();

        int c=st.executeUpdate(query);
        System.out.println(c);

    }
}
