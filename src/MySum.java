public class MySum {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10.0,20.0));
        System.out.println(sum(10L,20L));
    }

    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }
}
