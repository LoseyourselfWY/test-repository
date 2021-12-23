package JDBC;

import java.sql.*;
import java.util.ResourceBundle;

public class JDBCTest04 {
    public static void main(String[] args) {
//        使用资源绑定器绑定属性配置文件
//        属性配置文件xxx.properties必须放到类路径下（也就是scr包下，点开scr包下必须要直接看到这个配置文件）
//        如果要放到scr下面的包下，需要把src下面的包都写上，例如：com/javase/jdbc
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");

        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;

        try {
            //        1、注册驱动
            Class.forName(driver);
            //        2、获取连接
            conn = DriverManager.getConnection(url, user, password);

            //        3、获取数据库操作对象(Statement是专门执行sql语句的)
            stmt = conn.createStatement();

            //        4、执行sql语句
            String sql = "select empno,ename,sal from emp";

            rs = stmt.executeQuery(sql);//专门执行DQL（select）语句的方法


            //        5、处理查询结果集
            while (rs.next()) {
        /*        String empno = rs.getString(1);//此处的1代表第一列
                String ename = rs.getString(2);
                String sal = rs.getString(3);*/
                String empno = rs.getString("empno");//里面还能写列名,而且是查询结果的列名如果sql语句是"select empno as a,ename,sal from emp" 此处就要写a
                String ename = rs.getString("ename");
                String sal = rs.getString("sal");

//                int empno = rs.getInt("empno");//还能以其他类型取出，方便做运算
                System.out.println(empno + "," + ename + "," + sal);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            //        6、释放资源


//            为了保证资源一定释放，在finally语句块当中关闭资源
//            并且要遵循从小到大的原则依次关闭
//            并分别对其try catch,放到一起try catch的话分不清那个失败了
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
