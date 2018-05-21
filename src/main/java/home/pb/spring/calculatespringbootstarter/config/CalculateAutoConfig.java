package home.pb.spring.calculatespringbootstarter.config;

import home.pb.spring.calculatespringbootstarter.properties.CalculateProperties;
import home.pb.spring.calculatespringbootstarter.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(CalculateService.class)
@EnableConfigurationProperties(CalculateProperties.class)
public class CalculateAutoConfig {

    @Autowired
    private CalculateProperties calculateProperties;

    @Bean
    @ConditionalOnMissingBean(CalculateService.class)
    @ConditionalOnProperty(prefix = "calculate",value="enabled",havingValue = "true")
    public CalculateService calculateService(){
        return new CalculateService(calculateProperties.getScale());
    }

}
