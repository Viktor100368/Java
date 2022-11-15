package courseOnLine.Phinashkin.structureData;

import Prohor.Glava_12.H;

import java.util.Hashtable;

public class HashImplementation {
    public static void main(String[] args){
        Hashtable table = new Hashtable();
        table.put(10,"abc");
        table.put("trest234","test");
        System.out.println(table);
        System.out.println("haskCode 10 - "+new Integer(10).hashCode());
        System.out.println("hashCode terst234 - "+"trest234".hashCode());
        Hashtable table1 = new Hashtable(10);
        Hashtable table2 = new Hashtable(10,(float)0.75);
        for(int i=0;i<8;i++)
        table2.put("owner"+i,i);
        System.out.println(table2);
        System.out.println("size - "+table2.size());
    }
}
