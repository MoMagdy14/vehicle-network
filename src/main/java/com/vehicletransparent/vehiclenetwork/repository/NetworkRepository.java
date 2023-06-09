package com.vehicletransparent.vehiclenetwork.repository;

import com.vehicletransparent.vehiclenetwork.model.Network;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkRepository extends JpaRepository<Network, String> {
}
