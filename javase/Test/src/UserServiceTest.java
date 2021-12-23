public class UserServiceTest {
    public static void main(String[] args) {
        UserService userService = new UserService();
        try {
            userService.register("wag","123456");
        } catch (IllegalAccessException e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
