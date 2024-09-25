package com.example.transaction_mgmnt.dto;

import com.example.transaction_mgmnt.entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FlightBookingAcknowledgement {

    private String status;
    private double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;
}
