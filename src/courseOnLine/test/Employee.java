package courseOnLine.test;

public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public Employee(String name){
        this.name = name;
    }
    public void voice(){
        System.out.println(name);
    }
}
