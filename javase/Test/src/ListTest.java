import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        mylist.add("A");
        mylist.add("B");
        mylist.add("C");
        mylist.add("D");
        mylist.add("E");
      int n = 6 << 1;
        System.out.println(n);


        for(int i = 0;i<mylist.size();i++)
        {
            System.out.println(mylist.get(i));
        }
   /*     Iterator iterator = mylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }*/
    }
}
