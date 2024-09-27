package com.example.practicejpa.service;

import com.example.practicejpa.model.Address;
import com.example.practicejpa.model.Student;
import com.example.practicejpa.repo.AddressRepo;
import com.example.practicejpa.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepo addressRepo;
    @Autowired
    private StudentRepo studentRepo;
    public Address create(Address address) {
      return addressRepo.save(address);
    }
    public List<Address> get() {
        return addressRepo.findAll();
    }

    public Optional<Address> getById(int id) {
        return addressRepo.findById(id);
    }

    public void delById(int id) {
        addressRepo.deleteById(id);
    }

    public Address assignedValue(int aid, int sid) {
        Optional<Address> byId = getById(aid);
        Optional<Student> byId1 = studentRepo.findById(sid);
        if (byId.isPresent() && byId1.isPresent()){
            Address address = byId.get();
            Student student = byId1.get();
            address.getStudent().add(student);
           return addressRepo.save(address);
        }
     return null;

    }
}
