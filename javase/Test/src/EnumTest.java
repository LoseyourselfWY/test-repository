public class EnumTest {
    public static void main(String[] args) {

        Result divide = divide(10,0);
        System.out.println(divide);
        String n = new String("sdas");
        boolean asdas = n.contains("asdas");
        System.out.println(asdas);
    }

    /**
     *
     * @param a int 数据
     * @param b int 数据
     * @return Result.SUCCESS表示成功，Result.FAIL 表示失败
     */
    public static Result divide(int a, int b){
        try{
            int c = a/b;
            return Result.SUCCESS;
        }catch (Exception e){
            return  Result.FAIL;
        }
    }
    enum Result{
        SUCCESS,FAIL
    }



}
