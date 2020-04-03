package de.heinze.iot_measurements.service;

import de.heinze.iot_measurements.data.pojo.PojoWithCombinedKeyAdvanced;
import de.heinze.iot_measurements.data.repository.FluentObjectRepository;
import de.heinze.iot_measurements.data.repository.PojoWithCombinedKeyAdvancedRepository;
import de.heinze.iot_measurements.data.pojo.FluentObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

/**
 * @author Moritz Krischke
 * @version 1.0
 */
@Slf4j
@Component
public class DataInitializerBean {

    private final PojoWithCombinedKeyAdvancedRepository pojoWithCombinedKeyAdvancedRepository;
    private final FluentObjectRepository fluentObjectRepository;
    long iterationNumber = (long) (Math.random() * Long.MAX_VALUE);

    @Autowired
    public DataInitializerBean(PojoWithCombinedKeyAdvancedRepository pojoWithCombinedKeyAdvancedRepository, FluentObjectRepository fluentObjectRepository) {
        this.pojoWithCombinedKeyAdvancedRepository = pojoWithCombinedKeyAdvancedRepository;
        this.fluentObjectRepository = fluentObjectRepository;
    }


    private void insertData(LocalDateTime localDateTime, long iterationNumber){
        FluentObject fluentObject = FluentObject.BUILDER()
                .a("This is  a")
                .b("This is b")
                .c("This is c")
                .build();

        fluentObjectRepository.save(fluentObject);

        PojoWithCombinedKeyAdvanced pojo = PojoWithCombinedKeyAdvanced.builder()
                .key0("key0")
                .key1(iterationNumber)
                .key2("key2")
                .attribute0("Attribute0")
                .attribute1("Attribute1")
                .attribute2("Attribute2")
                .booleanAttribute(Math.random() > 0.5)
                .attribute4("Attribute4")
                .date(localDateTime)
                .build();


        pojoWithCombinedKeyAdvancedRepository.save(pojo);
    }


    @PostConstruct
    public void setup(){
        insertData(LocalDateTime.now(), iterationNumber++);
    }


    @Scheduled(initialDelay = 5000, fixedRate = 2000)
    public void update(){
        insertData(LocalDateTime.now(), iterationNumber++);
        log.info("Updated Entity");
        log.debug("Have updated the entity in the scheduler");
    }


}
