/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestBase1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class Demo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift="
                + "true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "root";
        String password = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet= statement.executeQuery("SELECT * FROM tasks");
            while(resultSet.next()){
                System.out.println(resultSet.getString(2));
            }
            resultSet.close();
            statement.close();
            connection.close();
        }catch(SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
