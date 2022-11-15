package Horstman.Glava_5;

import java.time.LocalDate;
abstract class  Person{
    public abstract String getDescription();
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class Employee extends Person{
    private String name;
    private double salary;
    private LocalDate hireDay;
    public Employee(String name,double salary,int year,int month,int day){
        super(name);
        this.name = name;
        this.salary= salary;
        hireDay = LocalDate.of(year,month,day);
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public LocalDate getHireDay(){
        return hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary+=raise;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f",salary);
    }
}
class Student extends Person{
    private String major;
    /**
     * @param name Имя студента
     * @param major Специализация студента
     */
    public Student(String name,String major){
        super(name);
        this.major= major;
        }

    @Override
    public String getDescription() {
        return "a student majoring in "+major;
    }
}
class Manager extends Employee{
    private double bonus;
    /**
     * @param n Имя работника
     * @param s Зарплата
     * @param year Год приема на работу
     * @param month Месяц приема на работу
     * @param day День приема на работу
     */
    public Manager(String n,double s,int year,int month,int day){
        super(n,s,year,month,day);
        bonus = 0;
    }
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }
    public void setBonus(double b){
        bonus = b;
    }
}
public class ManagerTest {
    public static void main(String[] args){
        //построить объект типа Manager
        Manager boss = new Manager("Carl Cracker",80000,1987,12,15);
        boss.setBonus(5000);
        Employee[] staff = new Employee[3];
        //запомнить массив staff объектами типа Manager и Employee
        staff[0]=boss;
        staff[1]= new Employee("Harry Hacker",50000,1989,10,1);
        staff[2]= new Employee("Tommy Tester",40000,1990,3,15);
        //вывести данные обо всех объектах Employee
        for(Employee e:staff)
            System.out.println("name: "+e.getName()+" salary: "+e.getSalary());
    }
}
