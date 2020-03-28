package de.heinze.iot_measurements.data.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class DHTData {

    @Id
    private long id;

    private String timestamp;
}
