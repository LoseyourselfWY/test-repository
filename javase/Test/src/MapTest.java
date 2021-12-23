import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "zhaoliu");

        Set<Integer> keys = map.keySet();
/*
        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key +"=" + value);
        }*/

        for(Integer key:keys){
            System.out.println(map.get(key));
        }
    }
}
