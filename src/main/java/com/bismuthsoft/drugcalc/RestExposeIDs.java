package com.bismuthsoft.drugcalc;

import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

@Component
public class RestExposeIDs implements RepositoryRestConfigurer {

    @Bean
    RepositoryRestConfigurer repositoryRestConfigurer() {
        return RepositoryRestConfigurer.withConfig(config -> {
            config.exposeIdsFor(Ingredient.class);
            config.exposeIdsFor(Container.class);
        });
    }

}
