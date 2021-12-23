package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*JDBC事务机制：
 *1、JDBC中的事务默认是自动提交的，每执行一次DML语句则自动提交一次
 * 但在实际的业务中，通常是由N条DML语句共同联合完成的，必须保证在同一个事务中同时成功或同时失败
 *  */
public class JDBCTest08 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
//            1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
//            2、获取连接
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bjpowernode", "root", "123456");
//            3、获取预编译的数据库操作对象
            String sql = "update dept set dname = ? where deptno = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "X部门");
            ps.setInt(2, 30);
            int count = ps.executeUpdate();

            ps.setString(1, "y部门");
            ps.setInt(2, 20);
             count = ps.executeUpdate();
            System.out.println(count);

//            5、处理结果数据集（无）
//            6、释放资源
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
