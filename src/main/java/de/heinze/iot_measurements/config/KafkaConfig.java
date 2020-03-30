package de.heinze.iot_measurements.config;

import de.heinze.iot_measurements.config.properties.KafkaProperties;
import de.heinze.iot_measurements.service.KafkaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

/**
 * @author Moritz Krischke
 * @version 1.0
 */
@Configuration
public class KafkaConfig {

    private final Environment environment;

    public KafkaConfig(Environment environment) {
        this.environment = environment;
    }


//    @Bean
//    public KafkaService kafkaService(){
//        final String connectionURL = environment.getProperty("de.heinze.kafka.connectionURL");
//        final String brokerAddress = environment.getProperty("de.heinze.kafka.brokerAddress");
//        return new KafkaService(connectionURL,brokerAddress);
//    }


    @Bean
    @Primary
    public KafkaService kafkaService(KafkaProperties kafkaProperties){
        return new KafkaService(kafkaProperties.getConnectionURL(), kafkaProperties.getBrokerAddress());
    }

}
