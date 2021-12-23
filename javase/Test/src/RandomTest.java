import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
       /* Random random = new Random();
        int num1 = random.nextInt();

        System.out.println(num1);
        int num2 = random.nextInt(101);
        System.out.println(num2);*/

        Random random = new Random();
        int index = 0;
        int[] arr = new int[5];
        do {
            int num = random.nextInt(6);
            boolean yn = true;
            for (int i = 0; i < arr.length; i++) {
                if (num == arr[i]) {
                    yn = false;
                    break;
                }
                else continue;
            }
            if (yn) {
                arr[index++] = num;

            }
            System.out.println("生成的随机数是：" + num);
        }
        while (index != arr.length );
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ",");
        }


    }
}
