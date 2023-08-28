package com.bocharov.service;

import com.dbocharov.Main;
import com.dbocharov.entity.MyEntity;
import com.dbocharov.repository.MyEntityRepo;
import com.dbocharov.service.MyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.UUID;

@SpringBootTest(classes = Main.class)
@ExtendWith(SpringExtension.class)
class MyTest {

    @Autowired
    private MyService myService;

    @Autowired
    private MyEntityRepo myEntityRepo;

    @BeforeEach
    public void init() {
        myEntityRepo.save(new MyEntity(UUID.randomUUID(), "only", "d-bocharov.com"));
    }

    @Test
    void test() {
        myService.update();
    }
}
