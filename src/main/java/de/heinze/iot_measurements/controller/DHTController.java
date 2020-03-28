package de.heinze.iot_measurements.controller;


import de.heinze.iot_measurements.data.pojo.DHTData;
import de.heinze.iot_measurements.service.DHTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class DHTController {

    private final DHTService dhtService;

    @Autowired
    public DHTController(DHTService dhtService) {
        this.dhtService = dhtService;
    }

    @PutMapping(path = "/data/store/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public DHTData storeSensorDataList(@RequestBody DHTData data) {
        return dhtService.storeDataInTable(data);
    }

    @PutMapping(path = "/data/storeAll/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<DHTData> storeSensorData(@RequestBody Iterable<DHTData> data) {
        return dhtService.storeDataInTable(data);
    }

    @GetMapping(path ="/data/",produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<DHTData> getData() {
        return dhtService.getAll();
    }

    @GetMapping(path ="/data/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<DHTData> getEntry(@PathVariable(name = "id") long id) {
        return dhtService.getEntry(id);
    }

    @GetMapping(path ="/data/example",produces = MediaType.APPLICATION_JSON_VALUE)
    public DHTData getExample() {
        return dhtService.getJSONExample();
    }

}
