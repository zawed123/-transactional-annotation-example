package com.example.transaction_mgmnt.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PASSENGER_INFO")
public class PassengerInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String email;
    private String source;
    private String destination;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-mm-yy")
    private Date travelDate;
    private String pickupTime;
    private String arrivalTime;
    private double fare;
}
