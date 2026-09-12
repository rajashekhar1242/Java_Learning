package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updateRecords {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://127.0.0.1:3306/college";
        String user="root";
        String password="#";
        Connection con= DriverManager.getConnection(url,user,password);
        String query="update student set full_name='max' where id=110";
        Statement st=con.createStatement();

        int cnt=st.executeUpdate(query);
        System.out.println(cnt);

    }
}
