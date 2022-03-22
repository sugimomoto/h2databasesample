package sugimomoto;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );

        Class.forName ("org.h2.Driver");
        Connection conn = DriverManager.getConnection ("jdbc:h2:~/test", "sa","");

        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM TEST");
        
        while(rs.next()){
            System.out.println(rs.getString("ID"));
            System.out.println(rs.getString("NAME"));
        }

    }
}
