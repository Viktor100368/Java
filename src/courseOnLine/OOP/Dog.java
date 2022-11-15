package courseOnLine.OOP;

public class Dog {
    String name;
    String poroda;
    int spead;
    void run(){
        for(int i=0;i<spead;i++)
        System.out.print("бегу ");
    }
    String info(){
        String str="";
        return str+=name+" "+poroda+" "+spead;
    }
        public static void main(String[] args){
        Dog dog= new Dog();
        dog.name="Bus";
        dog.poroda= "Dog";
        dog.spead = 12;
        dog.run();
        System.out.println();
        System.out.println(dog.info());
        }
}
