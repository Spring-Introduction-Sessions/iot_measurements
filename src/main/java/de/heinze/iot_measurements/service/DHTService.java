package de.heinze.iot_measurements.service;

import de.heinze.iot_measurements.data.pojo.DHTData;
import de.heinze.iot_measurements.data.repository.DHTRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DHTService {

    private final DHTRepository dhtRepo;

    @Autowired
    DHTService(DHTRepository dhtRepo) {
        this.dhtRepo = dhtRepo;
    }

    public DHTData storeDataInTable(DHTData data) {
        return dhtRepo.save(data);
    }

    public Iterable<DHTData> storeDataInTable(Iterable<DHTData> data) {
        return dhtRepo.saveAll(data);
    }

    public Iterable<DHTData> getAll() {
        return dhtRepo.findAll();
    }

    public Optional<DHTData> getEntry(long id) {
        return dhtRepo.findById(id);
    }

    public DHTData getJSONExample() {
        return new DHTData("20200328160047", 75.0, 14.0);
    }

}