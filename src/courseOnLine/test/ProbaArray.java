package courseOnLine.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ProbaArray {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> listCopy = new ArrayList<>(arrayList);
        for(int i=0;i<10;i++)
        arrayList.add("Сотрудник "+i);
        for(String s:arrayList)
            System.out.println(s);
        System.out.println();
//        Iterator<String> stringIterator= arrayList.iterator();
//        while (stringIterator.hasNext()) {
//            String str =stringIterator.next();
//            System.out.println(str);
 //       }
           for(int i=5;i<listCopy.size();i++){
               listCopy.remove(i);
           }
           for(String s:listCopy)
            System.out.println(s);
    }
}
