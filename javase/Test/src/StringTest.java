public class StringTest {
    public static void main(String[] args) {
        byte[] bytes = {77, 98, 99};
        String s1 = new String(bytes);
        System.out.println(s1);
        String s2 = new String(bytes, 0, 2);
        System.out.println(s2);
        String name = "asd-asdasd-qweqwe-".replace("-","+");
        System.out.println(name);
        name =name.replace("+","-");
        System.out.println(name);
        int n  = 20;
        System.out.println(n);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("aa");
        System.out.println(stringBuffer);
    }
}
