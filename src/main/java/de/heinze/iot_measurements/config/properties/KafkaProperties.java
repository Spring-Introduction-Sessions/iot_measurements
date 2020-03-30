package de.heinze.iot_measurements.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Moritz Krischke
 * @version 1.0
 */
@ConfigurationProperties(value = "de.heinze.kafka")
@Data
public class KafkaProperties {
    /**
     * This is the configuration string for the kafka service.
     */
    private String connectionURL;
    private String brokerAddress;
    /**
     * This defines the number of brokers. Default: 3
     */
    private int numberOfBrokers = 3;
    private Consumer consumer = new Consumer();

    @Data
    class Consumer{
        /**
         * This is a kafka consumer String.
         */
        public String consumerString = "DefaultConsumerString";
    }
}
