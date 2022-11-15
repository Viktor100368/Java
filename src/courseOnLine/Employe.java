package courseOnLine;

public class Employe {
    private  String name;
    private String dolgnost;
    private int sale;


    Employe(String name,String dolgnost,int sale){
        this.dolgnost = dolgnost;
        this.name = name;
        this.sale = sale;
    }
    String getinfo(int mont){
        String str="за полследние "+mont+" месяцев "+dolgnost+" "+name+" получил "+
                (mont*sale)+" рублей.";
        return str;
    }
    public static void main(String[] args){
        Employe emp = new Employe("Иван", "Программист",50000);
        String info=emp.getinfo(12);
        System.out.println(info);
    }
}
