import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest {
    public static void main(String[] args) {
        //        增强for（foreach）
//        for (元素类型 变量名：数组或集合){
//        System.out.println(变量名);
//        }
/*
        int [] arr = {123,343,655,7668,21};
        for(int data:arr){
            System.out.println(data);
        }
        */
        List<String> strList= new ArrayList<>();

        strList.add("hello");
        strList.add("world");
        strList.add("kitty");
//遍历 使用迭代器
       Iterator<String > iterator = strList.iterator();
       while (iterator.hasNext()){
           String s = iterator.next();
           System.out.println(s);
       }

//       使用foreach
        for(String s:strList){
            System.out.println(s);
        }
    }
}
