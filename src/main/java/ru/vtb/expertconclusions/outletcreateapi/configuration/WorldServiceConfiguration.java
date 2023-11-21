package ru.vtb.expertconclusions.outletcreateapi.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.vtb.expertconclusions.outletcreateapi.service.printservice.world.WorldService;
import ru.vtb.expertconclusions.outletcreateapi.service.printservice.world.impl.NumericServiceImpl;
import ru.vtb.expertconclusions.outletcreateapi.service.printservice.world.impl.WorldServiceImpl;

import static ru.vtb.expertconclusions.outletcreateapi.enams.NumericSwitchOnEnum.YES;
import static ru.vtb.expertconclusions.outletcreateapi.util.ManagedConstant.NUMERIC_SWITCH_ON_ENUM;

@Configuration
public class WorldServiceConfiguration {
    @Bean
    public WorldService worldServiceImpl() {
        if (NUMERIC_SWITCH_ON_ENUM == YES) {
            return new NumericServiceImpl();
        }
        return new WorldServiceImpl();
    }
}
