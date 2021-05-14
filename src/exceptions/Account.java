package exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Account {
    public Connection getConn()throws SQLException {
        String url = "jdbc:msql://localhost:3306/\n";
        String user = "abc";
        String password = "code";
        Connection connection =null;
        connection = DriverManager.getConnection(url,user,password);
        return connection;
    }
    public void withdraw(int amount){
       // getConn();
        System.out.println("withdraw : " + amount);
    }
    public static void main(String[] args) {




    }
}
