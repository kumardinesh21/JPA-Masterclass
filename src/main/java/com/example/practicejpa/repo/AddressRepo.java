package com.example.practicejpa.repo;


import com.example.practicejpa.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Integer> {
}
