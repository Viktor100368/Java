package Prohor;

import java.time.ZoneId;
import java.util.Arrays;

public class MyZone {
    public static void main(String[] args) {
        ZoneId z = ZoneId.of("Europe/Moscow");
        System.out.println(z);
    }
}
