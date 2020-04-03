package de.heinze.iot_measurements.data.repository;

import de.heinze.iot_measurements.data.pojo.CombinedKey;
import de.heinze.iot_measurements.data.pojo.CombinedKeyAdvanced;
import de.heinze.iot_measurements.data.pojo.PojoWithCombinedKey;
import de.heinze.iot_measurements.data.pojo.PojoWithCombinedKeyAdvanced;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

/**
 * @author Moritz Krischke
 * @version 1.0
 */
public interface PojoWithCombinedKeyAdvancedRepository extends CrudRepository<PojoWithCombinedKeyAdvanced, CombinedKeyAdvanced> {
}
