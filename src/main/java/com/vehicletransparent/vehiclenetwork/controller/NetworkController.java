package com.vehicletransparent.vehiclenetwork.controller;

import com.vehicletransparent.vehiclenetwork.model.Network;
import com.vehicletransparent.vehiclenetwork.service.NetworkService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicle")
public class NetworkController {

    final private NetworkService networkService;

    public NetworkController(NetworkService networkService) {
        this.networkService = networkService;
    }

    @GetMapping("/{plateNumber}/network")
    public Network getVehicleNetwork(@PathVariable("plateNumber") String plateNumber) {
        return networkService.getNetworkByPlateNumber(plateNumber);
    }

    @PostMapping("/network")
    public Network addNewVehicleNetwork(@RequestBody Network network) {
        return networkService.saveNetwork(network);
    }
}
