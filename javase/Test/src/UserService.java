public class UserService {
    public void register(String username, String password) throws IllegalAccessException {
        if (null == username || username.length() < 6 || username.length() > 14) {

            throw new IllegalAccessException("用户名不合法，长度必须在[6-14]之间");
        }
        System.out.println("注册成功，欢迎["+ username +"]");
    }
}
