package com.example.practicejpa.controller;
import com.example.practicejpa.model.Address;
import com.example.practicejpa.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/add")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping
    public Address create(@RequestBody Address address) {
        return addressService.create(address);
    }
    @GetMapping
    public List<Address> get() {
        return addressService.get();
    }

    @GetMapping("{id}")
    public Optional<Address> getById(@PathVariable int id) {
        return addressService.getById(id);
    }

    @DeleteMapping("{id}")
    public void delById(@PathVariable int id) {
        addressService.delById(id);

    }
    @PutMapping("{aid}/std/{sid}")
    public ResponseEntity<?> assignedValue(@PathVariable int aid,@PathVariable int sid){
        Address address = addressService.assignedValue(aid, sid);
        if (address!=null)
            return new ResponseEntity<>(address, HttpStatus.OK);
        return new ResponseEntity<>( HttpStatus.BAD_REQUEST);
    }

}