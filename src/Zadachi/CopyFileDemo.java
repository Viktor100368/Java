package Zadachi;
import java.io.*;
public class CopyFileDemo {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        if (args.length!=2){
            System.out.println("use file in- out");
            return;
        }
        try{
            fin= new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do{
                i=fin.read();
                if(i!= -1){
                    if(i==' ')i='-';
                    fout.write(i);
                }
            }while(i!= -1);
        }catch (IOException e){
            System.out.println(e);
        }
        finally {
            try{
                fin.close();
            }catch (IOException e){
                System.out.println("Error fin");
            }
            try{
                fout.close();
            }catch (IOException e){
                System.out.println("Error fout");
            }
        }

    }
}
