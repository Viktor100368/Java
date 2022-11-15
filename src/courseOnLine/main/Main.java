package courseOnLine.main;


import courseOnLine.test.MyArrayList;


public class Main {
    public static void main(String[] args) {

        MyArrayList array = new MyArrayList();

        for(int i=1;i<=9;i++)
            array.add("Сотрудник "+i);
        for(int i=0;i<array.size();i++)
            System.out.println(array.get(i));
        System.out.println(array.size());
        System.out.println();
        //Удалить все элементы с 5
       // for(int i=5;i<array.size();i++)
            array.remove(8);


        for(int i= 0;i<array.size();i++)
            System.out.println(array.get(i));
        System.out.println(array.size());

    }
}
