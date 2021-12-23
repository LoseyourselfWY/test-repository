import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        for(int i = 0;i<linkedList.size();i++){
            Object o = linkedList.get(i);
            System.out.println(o);
        }
    }
}
