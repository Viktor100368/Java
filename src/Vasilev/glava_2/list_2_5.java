package Vasilev.glava_2;

import java.util.Scanner;

public class list_2_5 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int now = 2022;
        String name;

        int age;
       float height;
        float mass;
        System.out.println("Ваше имя?");
        name = input.nextLine();
        System.out.println("Ваш возраст?");
        age = input.nextInt();
        System.out.println("Ваш рост в метрах?");
        height = input.nextFloat();
        System.out.println("Масса тела в килограммах?");
        mass= input.nextFloat();
        double bmi = mass/height/height;
        System.out.println("Здравствуйте "+name);
        System.out.println("Вы родились в "+(now - age)+" году");
        System.out.printf("Ваш индекс массы тела: %5.2f\n",bmi);
    }
}
