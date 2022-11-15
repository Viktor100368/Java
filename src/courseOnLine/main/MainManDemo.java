package courseOnLine.main;

import courseOnLine.test.Man;

public class MainManDemo {
    public static void main(String[] args) {
        String str="Это Иван, ему 34 года,его рост 166.3 см. Должность программист.";
        int age;
        String position;
        String name;
        double growth;
        String ages;
        String growths;
        ages=str.substring(14,16);
        growths=str.substring(31,36);
        age=Integer.parseInt(ages);
        growth= Double.parseDouble(growths);
        position = str.substring(str.length()-12,str.length()-1);
        name=str.substring(3,8);
        Man man = new Man(name,age,position,growth);

        System.out.println(man.getName());
        System.out.println(man.getAge());
        System.out.println(man.getPosition());
        System.out.println(man.getGrowth());

    }
}
