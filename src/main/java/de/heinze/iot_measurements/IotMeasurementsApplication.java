package de.heinze.iot_measurements;

import de.heinze.iot_measurements.config.properties.KafkaProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaRepositories
@EnableScheduling
@EnableConfigurationProperties(KafkaProperties.class)
public class IotMeasurementsApplication {

    public static void main(String[] args) {
        SpringApplication.run(IotMeasurementsApplication.class, args);
    }

}
