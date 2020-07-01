package io.github.positoy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(useDefaultFilters = true, excludeFilters = @ComponentScan.Filter(Controller.class))
public class AppConfig {
    @Autowired
    HelloService helloService;
}
