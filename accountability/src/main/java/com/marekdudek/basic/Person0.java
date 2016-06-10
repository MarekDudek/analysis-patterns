package com.marekdudek.basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
class Person0 {

    private TelephoneNumber0 number;
    private Address0         address;
    private EmailAddress0    email;
}
