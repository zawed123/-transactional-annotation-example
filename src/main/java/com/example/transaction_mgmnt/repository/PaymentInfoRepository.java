package com.example.transaction_mgmnt.repository;

import com.example.transaction_mgmnt.entity.PaymentInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PaymentInfoRepository extends CrudRepository<PaymentInfo, UUID> {
}
