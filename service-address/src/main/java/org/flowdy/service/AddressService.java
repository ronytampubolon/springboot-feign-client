package org.flowdy.service;

import org.flowdy.domain.entity.Address;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    public Address getAddressByCustomerId(String customerID){
        if(customerID.equalsIgnoreCase("10051")){
            return new Address("Jl. Gatot Subroto","Jakarta","12770");
        }
        return null;
    }
}
