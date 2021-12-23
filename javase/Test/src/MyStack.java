import javax.xml.stream.events.StartDocument;
import java.lang.reflect.Array;
import java.util.Scanner;

public class MyStack {
    //    栈帧，永远指向栈顶元素
    int index = 0;

    public Object[] Start() {
        System.out.println("请输入数组容量：");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        return new Object[s];
    }

    public int push(Object[] a) {

        if (index == a.length) {
//         System.out.println("栈已满，压栈失败");
            MyStackOperationException e = new MyStackOperationException("栈已满");
            String s = e.getMessage();
            System.out.println(s);
            return index;
        } else {
            System.out.println("请输入您要压栈的元素：");
            Scanner scanner = new Scanner(System.in);
            Object n = scanner.nextLine();
            a[index] = n;
            return index+1;
        }
    }

    public int pop(Object[] a) {
        if (index == 0) {
//            System.out.println("栈已空，弹栈失败");
            MyStackOperationException e = new MyStackOperationException("栈已空");
            String s = e.getMessage();
            System.out.println(s);
            return index;
        } else {
            System.out.println("弹出元素为：" + a[index - 1]);
            a[index - 1] = null;
            return index-1;
        }

    }

    public void see(Object[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }


}



