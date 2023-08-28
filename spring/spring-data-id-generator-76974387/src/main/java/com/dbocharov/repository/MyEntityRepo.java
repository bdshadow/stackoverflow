package com.dbocharov.repository;

import com.dbocharov.entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface MyEntityRepo extends JpaRepository<MyEntity, UUID> {

    MyEntity findByUsername(String username);
}
