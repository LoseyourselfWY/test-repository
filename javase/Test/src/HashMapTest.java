import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
       /* Map<Integer,String> map = new HashMap<>();
        map.put(1111,"zhangsan");
        map.put(6666,"lisi");
        map.put(7777,"wangwu");
        map.put(2222,"zhaoliu");
        map.put(2222,"king");

        System.out.println(map.size());//4

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for(Map.Entry<Integer, String> entry:set){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }*/

    Map map = new HashMap();
    map.put(null,null);
        System.out.println(map.size());
    //key重复的话value会覆盖
        map.put(null,100);
        System.out.println(map.size());
        System.out.println(map.get(null));
    }
}
