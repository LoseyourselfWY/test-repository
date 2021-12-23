package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * sql脚本
 * drop table if exists t_act;
 * create table t_act(
 * actno int,
 * balance double(7,2)
 * );
 * insert into t_act(antno,balance) values (111,20000);
 * insert into t_act(antno,balance) values (222,0);
 * commit;
 * select * from t_act；
 * */
public class JDBCTest09 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
//            1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
//            2、获取连接
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bjpowernode", "root", "123456");
//            将自动提交机制改为手动提交
            conn.setAutoCommit(false);//开启事务
//            3、获取预编译的数据库操作对象
            String sql = "update t_act set balance = ? where actno = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 10000);
            ps.setDouble(2, 111);
            int count = ps.executeUpdate();


            ps.setInt(1, 10000);
            ps.setDouble(2, 222);
            count += ps.executeUpdate();

            System.out.println(count == 2 ? "转账成功" : "转账失败");
//程序能走到这里证明以上程序没有异常，事务结束，手动提交数据
            conn.commit();
//            5、处理结果数据集（无）
//            6、释放资源
        } catch (Exception e) {
            if(conn != null )
            {
                try {
                    conn.rollback();
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
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
