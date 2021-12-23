import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

    public static void main(String[] args) {
   /*     System.out.println("main begin");
        try {
            m1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("main over");
    }

    private static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    private static void m2() throws FileNotFoundException {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }

    private static void m3() throws FileNotFoundException {
//        创建一个输入流文件，（）中填一个路径
       new FileInputStream("D:\\JAVA 配套资料\\IO流测试.txt");
*/
//        ------------------------------------------------
        /*try

        {
            FileInputStream fis = new FileInputStream("D:\\JAVA 配套资料\\IO流测试.txt");
            int read = fis.read();
            System.out.println(read);
        }catch (FileNotFoundException e){
            System.out.println("文件不存在！");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("hello world!");*/

        //-------------------------------------------
/*异常对象有两个重要的方法：
获取异常简单的描述信息：
String msg = exception.getMessage();

打印异常追踪的堆栈信息：
exception.printStackTrace();
*
* */
        int s = m();
        System.out.println(s);
    }
    public static int m(){
        int i = 100;
        try{
            System.out.println("try");
            return i;
        }finally {
            System.out.println("finally");
           i++;
        }
    }
}

