import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();


        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.add(6);



        Iterator iterator = c.iterator();

        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
            iterator.remove();
        }

        Iterator iterator1 = c.iterator();
        while (iterator1.hasNext()){
            Object next1 = iterator1.next();
            System.out.println(next1);
        }
    }
}
