package Shild.Glava_5;
//проверить на простые числа
public class FindjPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;
        num=5;
        if(num < 2) isPrime =false;
        else
            isPrime = true;
        for(int i=2;i<=num/i;i++){
            if((num % i)==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println("Простое число");
        else
            System.out.println("Не простое число");
        System.out.println();
        boolean done= false;
        for(int i=1;!done;i++){
            System.out.println(done);
            if(i==5)done = true;
        }
    }
}
