package de.heinze.iot_measurements.data.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * @author Moritz Krischke
 * @version 1.0
 */
@Data
@Entity
@IdClass(CombinedKey.class)
public class PojoWithCombinedKey {

    @Id
    private String key0;
    @Id
    private long key1;
    @Id
    private String key2;

    private String attribute0;
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;

}
