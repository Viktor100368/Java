package courseOnLine.OOP;
class Employe{
    String name;
    String position;
    int salary;
    Employe(String name,String position,int salary){
        this.name=name;
        this.position=position;
        this.salary=salary;
    }
    String info(int s){
        String str="";
        return str+= position+" "+name+" salary for "+s+" monts: "+(s*salary)+"$";
    }
}
public class EmployeDemo {
    public static void main(String[] args){
        Employe employe= new Employe("Viktor","programmer",20000);
        System.out.println(employe.info(8));
    }
}
