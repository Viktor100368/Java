package courseOnLine.main;

import courseOnLine.Employe;
import courseOnLine.test.*;

import java.util.ArrayList;

public class MainEmployeeDemo {
    public static void main(String[] args) {


        Driver driver1 = new Driver("Петр");
        Driver driver2 = new Driver("Макс");
        Driver driver3 = new Driver("Нина");
//    CookingAble cook;
//    DriveAble drever;
//    ProgrammingAble programmer;
        Programmer programmer1 = new Programmer("Федор");
        Programmer programmer2 = new Programmer("Никита");
        Programmer programmer3 = new Programmer("Саша");
        ArrayList<DriveAble> drive = new ArrayList<>();
        drive.add(driver1);
        drive.add(driver2);
        drive.add(driver3);

        ArrayList<ProgrammingAble> prog = new ArrayList<>();
        prog.add(programmer1);
        prog.add(programmer2);
        prog.add(programmer3);

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(driver1);
        employees.add(driver2);
        employees.add(driver3);
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(programmer3);

        for(Employee employee:employees)
            employee.voice();
        for(ProgrammingAble proger:prog)
            proger.programming();

        for(DriveAble driver:drive)
            driver.drive();

    }
}
