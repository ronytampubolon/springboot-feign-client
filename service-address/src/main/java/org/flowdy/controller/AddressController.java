package org.flowdy.controller;

import org.flowdy.domain.entity.Address;
import org.flowdy.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class AddressController {
    @Autowired
    AddressService addressService;
    @GetMapping("/{customerId}")
    public ResponseEntity<Address> getCustomerAddress(@PathVariable String customerId){
        return new ResponseEntity<>(addressService.getAddressByCustomerId(customerId), HttpStatus.OK);
    }
}
