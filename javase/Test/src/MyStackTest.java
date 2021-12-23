import java.util.Scanner;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Object[] a = myStack.Start();

        while (true) {
            System.out.println("\n*操作说明*");
            System.out.println("1：压栈");
            System.out.println("2：弹栈");
            System.out.println("3：查看当前堆栈内容");
            System.out.println("4：退出");
            System.out.println("当前栈顶指针为：" + myStack.index);
            System.out.print("请选择您要进行的操作：");


            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            switch (s) {
                case "1":
                    myStack.index = myStack.push(a);
                    break;
                case "2":
                    myStack.index = myStack.pop(a);
                    break;
                case "3":
                    myStack.see(a);
                    break;
                case "4":
                    System.exit(0);
            }
        }
    }
}
