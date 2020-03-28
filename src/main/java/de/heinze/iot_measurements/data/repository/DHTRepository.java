package de.heinze.iot_measurements.data.repository;

import de.heinze.iot_measurements.data.pojo.DHTData;
import org.springframework.data.repository.CrudRepository;

public interface DHTRepository extends CrudRepository<DHTData, Long> {

}
