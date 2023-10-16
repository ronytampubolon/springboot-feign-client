package org.flowdy.service;

import feign.Headers;
import org.flowdy.domain.entity.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(
        value = "service-address",
        url = "http://127.0.0.1:9192",
        path = "/api/address"
)
@Headers("Content-Type: application/json")
public interface AddressClient {
    @GetMapping("/{customerId}")
    public ResponseEntity<Address> getCustomerAddress(@PathVariable("customerId") String customerId);

}
