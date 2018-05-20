package homework4;
import java.util.Map;
import homework4.CountMap;
import homework4.CountMapImpl;

import javax.xml.bind.SchemaOutputResolver;

public class main {

    static void testCountMap() {
        CountMap<Integer> countMap = new CountMapImpl<>();

        // тестируем вставку элементов

        countMap.add(10);
        countMap.add(10);
        countMap.add(5);
        countMap.add(6);
        countMap.add(5);

        if (countMap.getCount(10) == 2
                && countMap.getCount(5) == 2
                && countMap.getCount(6) == 1) {
            System.out.println("Количество элементов совпадает");
        } else {
            System.out.println("Ошибка! Количество вставленных элементов не совпадает!");
        }

        System.out.println("Размер:" + countMap.size() + " элементов");
    }

    public static void main(String[] args) {
        testCountMap();
    }

    }

