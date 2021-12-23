public class MyStackOperationException extends RuntimeException {
    /*自定义异常的方法：
    1、继承一个异常（编译时异常或运行时异常）
    2、写两个构造方法，一个无参一个有参*/
    public MyStackOperationException() {
    }

    public MyStackOperationException(String message) {
        super(message);
    }
}
