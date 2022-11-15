package Shild.Glava_17;
//Ожидать завершения работы текстового редактора Notepad
public class ExecDemoFini {
    public static void main(String[] args) {
        Runtime r =  Runtime.getRuntime();
        Process p = null;
        try{
            p= r.exec("Notepad");
            Thread.sleep(5000);
            p.destroy();
        }catch (Exception e){
            System.out.println("Ошибка запуска Notepad");
        }
        System.out.println("Notepad возвратил "+p.exitValue());
    }
}
