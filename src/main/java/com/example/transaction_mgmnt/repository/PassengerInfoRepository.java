package com.example.transaction_mgmnt.repository;

import com.example.transaction_mgmnt.entity.PassengerInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PassengerInfoRepository extends CrudRepository<PassengerInfo, UUID> {
}
