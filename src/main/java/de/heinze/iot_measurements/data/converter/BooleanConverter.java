package de.heinze.iot_measurements.data.converter;

import javax.persistence.AttributeConverter;

/**
 * @author Moritz Krischke
 * @version 1.0
 */
public class BooleanConverter implements AttributeConverter<Boolean, String> {
    @Override
    public String convertToDatabaseColumn(Boolean attribute) {
        return attribute.toString();
    }

    @Override
    public Boolean convertToEntityAttribute(String dbData) {
        return "true".equals(dbData);
    }
}
