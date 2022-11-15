package courseOnLine.myLambda;

public class MyNumberDemo {
    public static void main(String[] args){
        MyNumber myNum ;
        myNum=()->(int)(Math.random()*100);
        System.out.println("random value = "+myNum.getValue());
        System.out.println("else a random value= "+myNum.getValue());
    }
}
