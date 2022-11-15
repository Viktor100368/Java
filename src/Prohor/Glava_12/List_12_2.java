package Prohor.Glava_12;

public class List_12_2 {
    public static void main (String[] args){
        MyButton button = new MyButton();
//        IClick ic = new A_1();
//        button.reg(ic);
          button.reg(new IClick() {
              @Override
              public void onClick() {
                  System.out.println("Кнопка нажата");
              }
          });
        for(int i=0;i<5;i++){
            button.click();
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}
//---------------interface--------------
interface IClick{
    void onClick();
}
//===============Class=================

//class A_1 implements IClick{
//    @Override
//    public void onClick(){
//        System.out.println("Кнопка нажата");
//    }
//}

class MyButton{
    private IClick ic = null;
    public void reg(IClick ic){
        this.ic = ic;
    }
    public void click(){
        if(this.ic != null)
            this.ic.onClick();
    }
}