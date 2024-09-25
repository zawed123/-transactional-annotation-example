package com.example.transaction_mgmnt.service;

import com.example.transaction_mgmnt.dto.FlightBookingAcknowledgement;
import com.example.transaction_mgmnt.dto.FlightBookingRequest;
import com.example.transaction_mgmnt.entity.PassengerInfo;
import com.example.transaction_mgmnt.entity.PaymentInfo;
import com.example.transaction_mgmnt.repository.PassengerInfoRepository;
import com.example.transaction_mgmnt.repository.PaymentInfoRepository;
import com.example.transaction_mgmnt.utils.PaymentValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class FlightBookingService {


    @Autowired
    private PassengerInfoRepository passengerInfoRepository;

    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional
    public FlightBookingAcknowledgement flightBooking(FlightBookingRequest request)
    {
        PassengerInfo passengerInfo=request.getPassengerInfo();
        passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo=request.getPaymentInfo();
        PaymentValidation.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFare());

        paymentInfo.setPassengerId(passengerInfo.getId());
        paymentInfo.setAmount(passengerInfo.getFare());

        paymentInfoRepository.save(paymentInfo);

        return FlightBookingAcknowledgement.builder()
                .status("SUCCESS")
                .totalFare(passengerInfo.getFare())
                .passengerInfo(passengerInfo)
                .pnrNo(UUID.randomUUID().toString().split("-")[0])
                .build();
    }
}
