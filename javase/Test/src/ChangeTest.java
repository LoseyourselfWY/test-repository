public class ChangeTest {
    public static void main(String[] args) {
//        String -> int
        String s1 = "100";
        int i = Integer.parseInt(s1);
        System.out.println(i);

//        int->String
        String s2 = i + "";
        System.out.println(s2 + 1);
//        int->Integer
        Integer x = 1000;
//  Integer->int
        int y = x;
//        String->Integer
         Integer integer = Integer.valueOf(s1);
//         Integer->String
        String e = String.valueOf(integer);


    }
}
