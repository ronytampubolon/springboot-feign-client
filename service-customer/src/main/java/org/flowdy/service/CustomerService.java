package org.flowdy.service;

import org.flowdy.domain.entity.Address;
import org.flowdy.domain.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired AddressClient addressClient;
    public Customer getCustomerById(Long customerId){
        if(customerId==10051){
            Customer result = new Customer(10051L,"Jhon DOe","jhondoe@gmail.com");
            // Using FeignClient
            ResponseEntity<Address> addressResponse = addressClient.getCustomerAddress(String.valueOf(customerId));
            result.setAddress(addressResponse.getBody());
            return result;
        }
        return null;
    }
}
