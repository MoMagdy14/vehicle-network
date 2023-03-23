package com.vehicletransparent.vehiclenetwork.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Network {
    @Id
    private String plateNumber;
    private String ssid;
    private String password;
}
