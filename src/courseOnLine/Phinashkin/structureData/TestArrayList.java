package courseOnLine.Phinashkin.structureData;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("lj");
        list.add("ljjlk;");
        list.add("lj");
        list.add("ljjlk;");
        list.add("lj");
        list.add("lj");
        System.out.println(list);
        while(list.remove("lj"));

        System.out.println(list);
        System.out.println(list.size());


    }
}
