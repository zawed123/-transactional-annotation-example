package com.example.transaction_mgmnt.dto;

import com.example.transaction_mgmnt.entity.PassengerInfo;
import com.example.transaction_mgmnt.entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;
}
