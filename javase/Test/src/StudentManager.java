import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
//        创建集合对象，用于存储学生数据
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {
            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            Scanner oppotion = new Scanner(System.in);
            String s = oppotion.nextLine();
            switch (s) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    deleteStudent(array);
                    break;
                case "3":
                    updateStudent(array);
                    break;
                case "4":
                    findAllStudent(array);
                    break;
                case "5":
                    System.exit(0);
            }
        }
    }
    //        定义一个方法，用于添加学生信息
    public static void addStudent(ArrayList<Student> array) {
//        键盘录入学生对象所需信息，显示提示信息，提示输入何种数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String sid = sc.nextLine();
        for(int i = 0 ;i<array.size();i++)
        {
            Student s = array.get(i);
            if (s.getSid().equals(sid))
            {
                System.out.println("您输入的学号已被占用，请重新输入");
                return;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

//        创建学生对象，把键盘录入的数据赋值给学生成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
//        将学生对象添加到集合中
        array.add(s);
//        给出添加成功提示
        System.out.println("添加学生成功");
    }
    //        定义一个方法，用于查看学生信息
    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("无学生信息，请先添加学生");
        } else {
            System.out.println("学号\t姓名\t年龄\t居住地");
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁" + "\t" + s.getAddress());
            }
        }
    }
    //        定义一个方法，用于删除学生信息
    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的学生的学号：");
        String sid = sc.nextLine();
        int index = -1;
        for (int i = 0;i<array.size();i++)
        {
            Student s = array.get(i);
            if(s.getSid().equals(sid)){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("该信息不存在，请重新输入");
            return;
        }
        else{
            array.remove(index);
            System.out.println("删除成功");
        }
        }
    //        定义一个方法，用于修改学生信息
    public static void updateStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生的学号：");
        String sid = sc.nextLine();
        int index = -1;
        for (int i = 0;i<array.size();i++)
        {
            Student s = array.get(i);
            if(s.getSid().equals(sid)){
              index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("该信息不存在，请重新输入");
            return;
        }
        System.out.println("请输入学生新姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生新地址");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        for(int i = 0;i<array.size();i++){
            Student student = array.get(i);
            if(student.getSid().equals(sid)){
                array.set(i,s);
                break;
            }
        }
        System.out.println("修改学生成功");
    }
}

