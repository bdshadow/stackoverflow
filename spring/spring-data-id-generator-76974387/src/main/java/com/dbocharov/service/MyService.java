package com.dbocharov.service;

import com.dbocharov.entity.MyEntity;
import com.dbocharov.repository.MyEntityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MyService {

    @Autowired
    private MyEntityRepo messageSendLogRepository;

    @Transactional
    public void update() {
        MyEntity myEntity= messageSendLogRepository.findByUsername("only");
        myEntity.setUsername("update");
    }
}
