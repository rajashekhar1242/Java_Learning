package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertRecords {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://127.0.0.1:3306/college";
        String user="root";
        String password="R78877887/@r";
        Connection con=DriverManager.getConnection(url,user,password);
        String query="insert into student values(110,'sharru',99,'O','TS')";
        Statement st=con.createStatement();

        //executeUpdate return the count of no.of insertion and execute() return boolean if update or insert else return resultSet
        int c=st.executeUpdate(query);
        System.out.println(c);
    }

}
