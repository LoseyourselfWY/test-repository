package JDBC;

import JDBC.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
这个程序负责修改被锁定的记录
* */
public class JDBCTest12 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = DBUtil.getConnection();
            conn.setAutoCommit(false);

            String sql = "update emp set sal = sal * 1.1 where job = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"MANAGER");
            int count = ps.executeUpdate();
            System.out.println(count);


            conn.commit();
        } catch (SQLException e) {
            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
            e.printStackTrace();
        }finally {
            DBUtil.closs(conn,ps,null);
        }
    }
}
