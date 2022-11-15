package courseOnLine.test;

import java.util.ArrayList;

public class ThreeColection {
    public static void main(String[] args){
        String str = "";
        int size = 10;
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> nameNumber = new ArrayList<>();
        for(int i=0;i<size;i++)
            number.add(i+1);
//        for(int i=0;i<size;i++)
//            name.add("Сотрудник "+i);
        name.add("федя");
        name.add("Костя");
        name.add("Fill");
        name.add("Igor");
        name.add("Kristina");
        name.add("Viktor");
        name.add("Sam");
        name.add("Petr");
        name.add("Vasil");
        name.add("Natali");

        for(int i=0;i<size;i++){
            nameNumber.add(number.get(i)+" - "+name.get(i));

        }
        for(String nm:nameNumber)
            System.out.println(nm);
    }
}
