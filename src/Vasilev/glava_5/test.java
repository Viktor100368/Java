package Vasilev.glava_5;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Map<Integer,String> myMap1=new HashMap<Integer, String>();
        myMap1.put(125,"Andrej");
        myMap1.put(353,"Boris");
        myMap1.put(54,"Mihael");
        myMap1.put(34,"Natalija");
        for(Integer val:myMap1.keySet()){
            System.out.print(val+" ");
        }
        System.out.println();
        for(String val:myMap1.values()){
            System.out.print(val+" ");
        }
//        Iterator<Map.Entry<Integer,String>> itr=myMap1.entrySet().iterator();
//        Map.Entry<Integer,String> entry=itr.next();

        for(Map.Entry entry:myMap1.entrySet()) {
            System.out.println("Key=" + entry.getKey() + " value " + entry.getValue());
        }

    }

}
