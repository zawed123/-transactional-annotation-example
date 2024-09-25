package com.example.transaction_mgmnt.controller;

import com.example.transaction_mgmnt.dto.FlightBookingAcknowledgement;
import com.example.transaction_mgmnt.dto.FlightBookingRequest;
import com.example.transaction_mgmnt.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flight")
public class FlightBookingController {

    @Autowired
    private FlightBookingService flightBookingService;

    @PostMapping("/booking")
    public FlightBookingAcknowledgement bookingFlight(@RequestBody FlightBookingRequest flightBookingRequest)
    {

           return flightBookingService.flightBooking(flightBookingRequest);
    }
}
