package com.example.transaction_mgmnt.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PAYMENT_INFO")
public class PaymentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String paymentId;
    private String accountNo;
    private double amount;
    private String cardType;
    private UUID passengerId;
}