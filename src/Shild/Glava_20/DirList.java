package Shild.Glava_20;
//использовать каталоги
import java.io.File;
public class DirList {
    public static void main(String[] args){
        String dirname="/JavaProject";
        File fil = new File(dirname);
        if(fil.isDirectory()){
            System.out.println("Каталог "+dirname);
            String s[] = fil.list();
            for(int i= 0; i<s.length; i++){
                File f = new File(dirname+"/"+s[i]);
                if(f.isDirectory()){
                    System.out.println(s[i]+" является каталогом");
                }else{
                    System.out.println(s[i]+" является файлом");
                }
            }
        }
        else
            System.out.println(dirname+" не является каталогом");
    }
}
