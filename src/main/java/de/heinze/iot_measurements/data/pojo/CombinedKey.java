package de.heinze.iot_measurements.data.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Moritz Krischke
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CombinedKey implements Serializable {
    private String key0;
    private long key1;
    private String key2;
}
