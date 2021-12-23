package JDBC;

import java.sql.*;
import java.util.ResourceBundle;

public class JDBCTest03 {
    public static void main(String[] args) {
//        使用资源绑定器绑定属性配置文件
//        属性配置文件xxx.properties必须放到类路径下（也就是scr包下，点开scr包下必须要直接看到这个配置文件）
//        如果要放到scr下面的包下，需要把src下面的包都写上，例如：com/javase/jdbc
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        String  url= bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");

        Statement stmt = null;
        Connection conn = null;

        try {
            //        1、注册驱动
            Class.forName(driver);
            //        2、获取连接
            conn = DriverManager.getConnection(url, user, password);
//            数据库连接对象：com.mysql.jdbc.JDBC4Connection@506c589e
            System.out.println("数据库连接对象：" + conn);


            //        3、获取数据库操作对象(Statement是专门执行sql语句的)
            stmt = conn.createStatement();

            //        4、执行sql语句
            String sql = "update dept set dname = '销售部',loc = '杭州' where deptno = 20 ";


//            专门执行DML语句的（insert，delete，update）
//            返回值是“影响数据库中记录的条数”

            int count = stmt.executeUpdate(sql);
            System.out.println(count == 1 ? "添加成功" : "添加失败");


            //        5、处理查询结果集

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
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
