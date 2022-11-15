package courseOnLine.test;

public class Random {
    public static void main(String[] args) {
      int result = (int)(Math.random()*90+10);
      String str =String.format("Случайное число %s .Попробуйте еще раз",result);
        System.out.println(str);
    }
}
