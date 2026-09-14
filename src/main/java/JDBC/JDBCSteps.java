package JDBC;//1.import packages
import java.sql.*;

public class JDBCSteps {
    public static void main(String[] args) throws ClassNotFoundException, SQLException  {
        /* 2.load/registerDriver
        Class.forName() tells java to load the particular class
        but modern java directly load and register driver when jar is added
        */
//        Class.forName("com.mysql.cj.jdbc.Driver");

        //3.Create Connection
        String url="jdbc:mysql://127.0.0.1:3306/college";
        String user="root";
        String password="#";
        Connection con=DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established");

        //4.create statement
        String statement="select * from student";
        Statement st=con.createStatement();

        //5.Execute Statement
        ResultSet rs=st.executeQuery(statement);


        //Fetch Records READ operation in crud
        int i=1;
        while(rs.next())
        {
            System.out.println("Row "+i++);
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
        }

        //6.close connection
        con.close();









    }

}
