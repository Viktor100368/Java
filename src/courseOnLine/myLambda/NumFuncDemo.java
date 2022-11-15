package courseOnLine.myLambda;

public class NumFuncDemo {
    public static void main(String[] args){
        SomeFunc<Integer> numFunc=(n)->{
            int result=1;
            for(int i=1;i<=n;i++){
                result=result*i;
            }
            return result;
        };
        System.out.println(numFunc.func(3));
        System.out.println(numFunc.func(5));
    }
}
