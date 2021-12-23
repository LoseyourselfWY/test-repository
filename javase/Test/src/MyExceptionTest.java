public class MyExceptionTest {
    public static void main(String[] args) {
        MyException e = new MyException("用户名不能为空");

        e.printStackTrace();

        String s = e.getMessage();
        System.out.println(s);
    }
}
