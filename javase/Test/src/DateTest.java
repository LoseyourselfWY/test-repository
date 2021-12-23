import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
/*
        Date nowtime = new Date();
        System.out.println(nowtime);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String format = simpleDateFormat.format(nowtime);
        System.out.println(format);
*/

        long l = System.currentTimeMillis();
        System.out.println(l);
        print();
        long l1 = System.currentTimeMillis();
        double s = (double) (l1 - l);
        System.out.println(s);
    }

    public static void print() {
        for (int i = 0; i < 1000000; i++) {
            System.out.println("i=" + i);
        }
    }
}
