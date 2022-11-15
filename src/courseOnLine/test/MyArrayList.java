package courseOnLine.test;

public class MyArrayList {
    private int size=0;
    private String[] arr= new String[10];

    public void add(String str){
        arr[size] = str;
        size++;
        if(size ==arr.length){
           String[] arrNew = new String[arr.length*2];
           for(int i=0;i<arr.length;i++){
               arrNew[i] = arr[i];
           }
           arr=arrNew;
        }

    }
    public String get(int index){
        if(index>=0 & index<size) {
            return arr[index];
        }
        else
            return "Не правильно введенный индекс";
    }
    public int size(){
        return size;
    }
    public void remove(int index){
        if(index>=0 && index <size) {
            for (int i = index; i < size-1 ; i++) {
                arr[i] = arr[i + 1];
            }
            size --;
        }
//        else
//            System.out.println("Не правильно введенный индекс");

    }
    public void remove(String str){
        int count=-1;
        for(int i=0;i<size;i++){
            if(str.equals(arr[i])) {
                count = i;
                break;
            }
        }
        remove(count);
    }
}
