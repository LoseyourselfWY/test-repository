package JDBC;

import java.sql.*;

public class JDBCTest01 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;

        try {
            //        1、注册驱动
//            此处需要讲jar包导入后才能有Driver类，而不是Driver接口
            Driver driver = new com.mysql.jdbc.Driver();

            DriverManager.registerDriver(driver);
            //        2、获取连接

            /*
             * URL:统一资源定位符（网络中某个资源的绝对路径）
             * https://www.baidu.com/  就是一个url
             *
             * URL包括那几个部分：
             * 协议
             * IP
             * PORT
             * 资源名
             *
             * jdbc:mysql://127.0.0.1:3306/bjpowernode
             *
             *jdbc:mysql:// 协议
             * 127.0.0.1 IP地址（这里写localhost和127.0.0.1 都是本机IP地址）
             * 3306 mysql数据库端口号
             * bjpowernode 具体的数据库实例名
             *
             * */
            String url = "jdbc:mysql://127.0.0.1:3306/bjpowernode";
            String user = "root";
            String password = "123456";
             conn = DriverManager.getConnection(url, user, password);
//            数据库连接对象：com.mysql.jdbc.JDBC4Connection@506c589e
            System.out.println("数据库连接对象：" + conn);


            //        3、获取数据库操作对象(Statement是专门执行sql语句的)
            stmt = conn.createStatement();

            //        4、执行sql语句
            String sql = "update dept set dname = '销售部',loc = '天津' where deptno = 20 ";


//            专门执行DML语句的（insert，delete，update）
//            返回值是“影响数据库中记录的条数”

            int count = stmt.executeUpdate(sql);
            System.out.println(count == 1 ? "添加成功" : "添加失败");


            //        5、处理查询结果集

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //        6、释放资源


//            为了保证资源一定释放，在finally语句块当中关闭资源
//            并且要遵循从小到大的原则依次关闭
//            并分别对其try catch,放到一起try catch的话分不清那个失败了
            try {
                if (stmt != null) {
                    stmt.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }


    }
}
