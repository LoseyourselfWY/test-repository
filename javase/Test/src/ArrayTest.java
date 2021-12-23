public class ArrayTest {
    public static void main(String[] args) {
        int[][] a = {
                {100, 200, 300},
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {0}
        };
        printArray(a);


    }
    public static void printArray(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
