package courseOnLine.myLambda;

public class NumericTest2Demo {
    public static void main(String[] args){
        NumericTest2 numTest2;
        numTest2=(n,k)->(n % k)==0;
        System.out.println(numTest2.variableIsAMultipli(6,3));
    }
}
