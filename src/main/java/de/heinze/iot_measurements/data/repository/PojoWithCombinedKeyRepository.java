package de.heinze.iot_measurements.data.repository;

import de.heinze.iot_measurements.data.pojo.CombinedKey;
import de.heinze.iot_measurements.data.pojo.PojoWithCombinedKey;
import org.springframework.data.repository.Repository;

/**
 * @author Moritz Krischke
 * @version 1.0
 */
public interface PojoWithCombinedKeyRepository extends Repository<PojoWithCombinedKey, CombinedKey> {
    PojoWithCombinedKey findByKey0(String key0);
}
