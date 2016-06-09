package com.marekdudek.basic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Person0 {

    private TelephoneNumber0 number;
    private Address0         address;
    private EmailAddress0    email;
}