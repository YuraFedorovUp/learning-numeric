package ru.vtb.expertconclusions.outletcreateapi.util;

import lombok.experimental.UtilityClass;
import ru.vtb.expertconclusions.outletcreateapi.enams.LanguageEnam;
import ru.vtb.expertconclusions.outletcreateapi.enams.NameFileEnam;
import ru.vtb.expertconclusions.outletcreateapi.enams.NumericSwitchOnEnum;
import ru.vtb.expertconclusions.outletcreateapi.enams.ShaffleEnam;

import static ru.vtb.expertconclusions.outletcreateapi.enams.NumericSwitchOnEnum.YES;

@UtilityClass
public class ManagedConstant {

    //время в милисекундах на каждое cлово  1000L  - это 1 секунда
    public final static Long timeToWait = 2300L;
    //время в милисекундах на каждое упражнение  180000L  - это 3 секунды
    public final static Long timeToSwitch = 3000000L;

    //язык
    public final static LanguageEnam language = LanguageEnam.Russian;
//    public final static LanguageEnam language = LanguageEnam.English;

    // надо ли перемешивать список слов
//    public final static ShaffleEnam shaffle = ShaffleEnam.off;
    public final static ShaffleEnam shaffle = ShaffleEnam.on;

//    public final static NameFileEnam nameFile = NameFileEnam.dictionary;
    public final static NameFileEnam nameFile = NameFileEnam.verb;



    //       public final static NumericSwitchOnEnum numericSwitchOnEnum = NO;
    public final static NumericSwitchOnEnum numericSwitchOnEnum = YES;


    //   максимальное рандомное число
    //
    //    public final static int MAX_RANDOM_NUMBER = 1000_000;
    public final static int MAX_RANDOM_NUMBER = 1_000;
}
