package de.heinze.iot_measurements.data.repository;

import de.heinze.iot_measurements.data.pojo.FluentObject;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Moritz Krischke
 * @version 1.0
 */
public interface FluentObjectRepository extends CrudRepository<FluentObject, String> {
}
