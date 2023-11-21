package ru.vtb.expertconclusions.outletcreateapi.service.printservice.world.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ru.vtb.expertconclusions.outletcreateapi.data.Data;
import ru.vtb.expertconclusions.outletcreateapi.service.printservice.world.WorldService;

import java.util.Map;

//@Component
public class WorldServiceImpl implements WorldService {
    @Autowired
    Data data;
    Map<Integer, String> map3 = Map.of(0, "Мне", 1, "Нам", 2, "Тебе", 3, "Вам", 4, "Ему", 5, "Ей", 6, "Им", 7, "Им");


    int x = 0;
    private boolean isNo;

    @Override
    public String getWorld(String world) {
        isNo = false;
        return getWorldit(world);
    }

    private String getWorldit(String world) {
//      //3
//        return getWorld() + "   " + getPronoun() + "   "
//                + getAdjective()
                ;
//      //2
//        return getWorld() + "   " + getPronoun() + "   ";

        //1
        return world + "  " +getPronoun(map3);
    }


    private String getAdjective() {
        Map<Integer, String> map = Map.of(0, "Большой", 1, "Маленький", 2, "Красивый", 3, "счастливый", 4, "Клевый", 5, "Умный",
                6, "Прикольный", 7, "Желтый", 8, "Красный", 9, "Зеленый");
        return map.get(getRandom(10));
    }

    private String getWorld() {
        Map<Integer, String> map = Map.of(0, "Мир", 1, "Стол", 2, "Кошка", 3, "Дом", 4, "Машина", 5, "Комната",
                6, "Животное", 7, "Собака", 8, "Окно", 9, "Телефон");
        return map.get(getRandom(10));
    }

    private String getPronoun() {
        Map<Integer, String> map = Map.of(0, "Мой", 1, "Наш", 2, "Твой", 3, "Ваш", 4, "Его", 5, "Ее", 6, "Оно", 7, "Их");
        return map.get(getRandom(8));
    }

    private String getPronoun(Map<Integer, String> map3) {
        return map3.get(getRandom(8));
    }


    private int getRandom(int i) {
        while (true) {
            int rand = (int) (Math.random() * 10);
            if (rand < i)
                return rand;
        }
    }

    private int getRandom(int i, int max) {
        while (true) {
            int rand = (int) (Math.random() * 1000);
//            if (rand < i)
            return rand;
        }
    }
}
