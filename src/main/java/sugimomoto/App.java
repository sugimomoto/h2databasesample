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
        Connection conn = DriverManager.getConnection ("jdbc:h2:~/testdb", "sa","");

        Statement st = conn.createStatement();

        st.execute("DROP TABLE IF EXISTS TEST;");
        st.execute("CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255));");
        st.execute("INSERT INTO TEST VALUES(1, 'Hello');");
        st.execute("INSERT INTO TEST VALUES(2, 'World');");

        ResultSet rs = st.executeQuery("SELECT * FROM TEST");
        
        while(rs.next()){
            System.out.println(rs.getString("ID"));
            System.out.println(rs.getString("NAME"));
        }

    }
}
