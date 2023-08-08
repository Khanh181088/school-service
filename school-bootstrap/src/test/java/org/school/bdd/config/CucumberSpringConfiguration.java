package org.school.bdd.config;

import io.cucumber.spring.CucumberContextConfiguration;
import org.school.SchoolApplication;
import org.school.bdd.vo.SpringDataContainer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.test.context.ActiveProfiles;

@CucumberContextConfiguration
@SpringBootTest(classes = {
        CucumberSpringConfiguration.class,
        SchoolApplication.class
})
@ActiveProfiles(profiles = {"db_h2", "integration_test"})
public class CucumberSpringConfiguration {

    @Bean
    @Scope("cucumber-glue")
    public SpringDataContainer container() {
        return new SpringDataContainer();
    }
}
