package ru.vtb.expertconclusions.outletcreateapi.service.printservice.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vtb.expertconclusions.outletcreateapi.service.printservice.PrintService;
import ru.vtb.expertconclusions.outletcreateapi.service.printservice.world.WorldService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PrintServiceImpl implements PrintService {
    private final WorldService worldService;
    @Override
    public void print(List<String> worlds) {
//        new TextFieldTest(worlds);
        TextFieldTestWithTime textFieldTest=  new TextFieldTestWithTime(worldService);
        textFieldTest.job(worlds);
    }
}
