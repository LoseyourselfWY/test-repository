import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties pro = new Properties();


        pro.setProperty("url","jdbc:mysql://localhost:3306/bjpowernode");
        pro.setProperty("driver","com.mysql.jdbc.Driver");
        pro.setProperty("username","root");
        pro.setProperty("password","123456");

        String url = pro.getProperty("url");
        String driver = pro.getProperty("driver");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");

        System.out.println(url);
        System.out.println(driver);
        System.out.println(username);
        System.out.println(password);
    }

}
