package ru.vtb.expertconclusions.outletcreateapi.service.printservice.world.impl;

import org.springframework.stereotype.Service;
import ru.vtb.expertconclusions.outletcreateapi.service.printservice.world.WorldService;

import static ru.vtb.expertconclusions.outletcreateapi.util.ManagedConstant.MAX_RANDOM_NUMBER;

//@Service
public class NumericServiceImpl implements WorldService {


    @Override
    public String getWorld(String world) {
        final Integer random = getRandom(MAX_RANDOM_NUMBER);
        return random.toString();
    }

    private Integer getRandom(int maxRandomNumber) {
//        int result = 99;
//        while (result % 100 > 20) {
//            result = (int) (Math.random() * maxRandomNumber);
//        }
//        return result;
        return (int) (Math.random() * maxRandomNumber);
    }
}
