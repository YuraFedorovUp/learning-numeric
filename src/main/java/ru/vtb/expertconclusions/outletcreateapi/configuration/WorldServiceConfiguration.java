package ru.vtb.expertconclusions.outletcreateapi.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.vtb.expertconclusions.outletcreateapi.service.printservice.world.WorldService;
import ru.vtb.expertconclusions.outletcreateapi.service.printservice.world.impl.NumericServiceImpl;
import ru.vtb.expertconclusions.outletcreateapi.service.printservice.world.impl.WorldServiceImpl;

@Configuration
public class WorldServiceConfiguration {
    @Bean
    @ConditionalOnProperty(value = "learning.numeric.enabled", havingValue = "true")
    public WorldService worldServiceImpl() {
        return new NumericServiceImpl();
    }

    @Bean
    @ConditionalOnMissingBean(WorldService.class)
    public WorldService worldServiceImpl1() {
        return new WorldServiceImpl();
    }
}
