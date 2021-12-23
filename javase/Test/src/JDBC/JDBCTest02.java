package JDBC;

import java.sql.*;

public class JDBCTest02 {
    public static void main(String[] args) {
        try {
            //        1、注册驱动

//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//            以上一行代码在Driver类中的静态代码块中有
//            故此处可使用反射机制来完成注册驱动
//            以下代码不需要接受范围值，我们只需要它的类加载动作，在执行类加载时会执行静态代码块
                Class.forName("com.mysql.jdbc.Driver");

            //        2、获取连接
            String url = "jdbc:mysql://127.0.0.1:3306/bjpowernode";
            String user = "root";
            String password = "123456";
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
