package Prohor.Glava_12;
@FunctionalInterface
interface MyInterface{
    String reverse(String s);
}

public class HabrInterface {
    public static void main(String[] args) {
        MyInterface myInterface = (str)->{
            String result="";
            for(int i = str.length()-1;i>=0;i--){
                result += str.charAt(i);
            }
            return result;

        };
        System.out.println("Lambda reversed= "+ myInterface.reverse("Lambda"));
    }
}
