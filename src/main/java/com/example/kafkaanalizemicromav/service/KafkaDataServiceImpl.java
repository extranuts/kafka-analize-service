package com.example.kafkaanalizemicromav.service;

import com.example.kafkaanalizemicromav.model.Data;

public class KafkaDataServiceImpl implements KafkaDataService {

    @Override
    public void handle(Data data) {
        System.out.println("Data object is received: " + data.toString());
    }
}
