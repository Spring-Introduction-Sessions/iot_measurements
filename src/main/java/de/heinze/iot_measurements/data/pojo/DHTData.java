package de.heinze.iot_measurements.data.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class DHTData {

    @Id
    private long id;

    private String timestamp;

    private double humidity;

    private double degreeCelsius;

    public DHTData() {}

    public DHTData(String timestamp, double humidity, double degree) {
        this.degreeCelsius = degree;
        this.humidity = humidity;
        this.timestamp = timestamp;
    }
}
