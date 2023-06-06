package com.spring.auth;

import com.spring.customer.CustomerDTO;

public record AuthenticationResponse (
        String token,
        CustomerDTO customerDTO){
}
