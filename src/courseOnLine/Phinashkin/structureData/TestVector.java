package courseOnLine.Phinashkin.structureData;

import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        Vector vec = new Vector();
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);
        vec.add(6);
        vec.add(7);
        vec.add(8);
        vec.add(9);
        vec.add(10);
        System.out.println("capacity "+vec.capacity());
        vec.add(46);
        System.out.println(vec);
        System.out.println("capacity "+vec.capacity());
        vec.remove(1);
        vec.remove(4);
        vec.remove(6);
        System.out.println(vec);
        System.out.println("size "+vec.size());
        System.out.println("capacity "+vec.capacity());
        vec.setSize(4);
        System.out.println("size "+vec.size());
        System.out.println("capacity "+vec.capacity());
        System.out.println(vec);
        vec.setSize(8);
        System.out.println(vec);
        System.out.println("capacity "+vec.capacity());
        System.out.println("size "+vec.size());
        vec.add(2,789);
        System.out.println(vec);
        System.out.println("size "+vec.size());
        System.out.println("capacity "+vec.capacity());
    }
}
