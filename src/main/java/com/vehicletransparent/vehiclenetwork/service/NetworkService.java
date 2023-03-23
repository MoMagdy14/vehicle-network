package com.vehicletransparent.vehiclenetwork.service;

import com.vehicletransparent.vehiclenetwork.model.Network;
import com.vehicletransparent.vehiclenetwork.repository.NetworkRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class NetworkService {

    final private NetworkRepository networkRepository;

    public NetworkService(NetworkRepository networkRepository) {
        this.networkRepository = networkRepository;
    }

    public Network getNetworkByPlateNumber(String plateNumber) {
        return networkRepository.findById(plateNumber).orElseThrow(
                () -> new NoSuchElementException()
        );
    }

    public Network saveNetwork(Network newNetwork) {
        return networkRepository.save(newNetwork);
    }
}
