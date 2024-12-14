package edu.iuh.dit.Week5Application.backend.services;

import edu.iuh.dit.Week5Application.backend.models.Address;
import edu.iuh.dit.Week5Application.backend.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address getAddressById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }
}
