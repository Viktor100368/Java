package Shild.Glava_18;

import java.util.Properties;
import java.util.Set;

public class PropDemo {
    public static void main(String[] args){
        Properties capitals = new Properties();
        capitals.put("Иллинойс","Спрингфилд");
        capitals.put("Миссури","Джефферсон-Сити");
        capitals.put("Вашингтон","Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана", "Индианаполис");
        //Получить множество ключей
        Set<?> states = capitals.keySet();
        //Показать все штаты и их столицы
        for(Object name: states)
            System.out.println("Столица штата "+ name+ " - "+
                    capitals.getProperty((String)name)+" . ");
        System.out.println();
        //Найти штат , отсутствующий в списке, указав значения,
        //выбираемые по умолчанию
        String str = capitals.getProperty("Флорида", "Не найдена");
        System.out.println("Столица штата Флорида "+ str+" . ");

    }
}
