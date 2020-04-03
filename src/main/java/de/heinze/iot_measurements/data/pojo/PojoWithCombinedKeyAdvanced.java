package de.heinze.iot_measurements.data.pojo;

import de.heinze.iot_measurements.data.converter.BooleanConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.time.LocalDateTime;

/**
 * @author Moritz Krischke
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@IdClass(CombinedKeyAdvanced.class)
public class PojoWithCombinedKeyAdvanced {

    @Id
    private String key0;
    @Id
    private long key1;
    @Id
    private String key2;

    @Column(length = 16)
    private String attribute0;
    private String attribute1;
    private String attribute2;

    @Convert(converter = BooleanConverter.class)
    private boolean booleanAttribute;


    @Column(name = "MyAttribute", length = 55)
    private String attribute4;


    private LocalDateTime date;

}
