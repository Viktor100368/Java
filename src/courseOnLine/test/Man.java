package courseOnLine.test;

public class Man {
    private String name;
    private int age;
    private String position;
    private double growth;

    public Man(String name, int age, String position, double growth){
        this.age =age;
        this.growth = growth;
        this.position = position;
        this.name =  name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public double getGrowth() {
        return growth;
    }
}

