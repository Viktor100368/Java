package courseOnLine.myLambda;

public class NumericTestDemo {
    public static void main(String[] args) {
        NumericTest isEven= (n)->(n%2)==0;
        System.out.println("isEven: "+isEven.test(12));
        NumericTest isNotNegative = (n)-> n>=0;
        System.out.println("isNotNegative: "+isNotNegative.test(-4));

    }


}
