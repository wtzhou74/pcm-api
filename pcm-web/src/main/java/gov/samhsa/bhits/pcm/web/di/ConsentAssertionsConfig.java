package gov.samhsa.bhits.pcm.web.di;

import gov.samhsa.bhits.pcm.service.consent.ConsentAssertion;
import gov.samhsa.bhits.pcm.service.consent.pg.ConsentOneToOneAssertion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsentAssertionsConfig {

    @Bean
    public ConsentAssertion consentOneToOneAssertion(){
        return new ConsentOneToOneAssertion();
    }
}
