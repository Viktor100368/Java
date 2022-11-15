package courseOnLine.test;

public class MyMath {
    private static final double PI = 3.14;

    public static int square(int number){
        return number*number;
    }
    public static double length(double radius){
        return PI*radius*2;
    }
    public static double area(double radius){
        return PI*radius*radius;
    }
    public static int midArSum(int[] numbers){
        int sum=0;
        for(int i=0;i<=numbers.length-1;i++) {
            sum += numbers[i];
        }
        sum/=numbers.length;
        return sum;
    }

}
