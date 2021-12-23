public class MC {
    public static void main(String[] args) {
       int count = 10000;
        double sum = 0;
        double pi = 3.14159265;
        double p = 1/pi;
        for(int i = 0;i<count;i++){
            double x = (Math.random()*pi);
            sum =sum + (Math.sin(x)/p);
        }
        sum = sum/count;
        System.out.println(sum);
    }
}