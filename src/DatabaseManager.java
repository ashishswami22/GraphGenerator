
package GraphGenerator;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DatabaseManager {
    private Connection con;
    private Statement st;
    public static int MYSQLdriver=0;
    public static int ORACLEdriver=1;
    public static int ODBCdriver=2;
    
    public DatabaseManager(int driver, String serverURL, String dbname, String uname, String pwd){
        try{
            switch(driver){
                case 0:
                        Class.forName("com.mysql.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://"+ serverURL + "/" + dbname,uname,pwd);
                        break;
                case 1:
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        con=DriverManager.getConnection("jdbc:oracle:thin:@"+ serverURL ,uname,pwd);
                        break;
                case 2:
                        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                        con=DriverManager.getConnection("jdbc:odbc:"+ dbname);
            }
            if(con!=null){
                    st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                   JOptionPane.showMessageDialog(null, "Database connection Successful!");
             }
        
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Database connection Unsuccessful! Check inputs & try again");
        }
    }
    
    public ResultSet executeQuery(String query){
        try{
            return st.executeQuery(query);
        }catch(Exception e){
            return null;
        }
    }
}
