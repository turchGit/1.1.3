package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static  Connection connection;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



    public static void jdbcConnect(){
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        if (connection==null){
            jdbcConnect();
        }
        return connection;

    }
// реализуйте настройку соеденения с БД
}
