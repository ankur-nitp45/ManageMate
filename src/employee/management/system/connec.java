package employee.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connec {

    Connection connection;
    Statement statement;

    public connec(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management","root","Ankur@2732");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}