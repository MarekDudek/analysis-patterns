package com.marekdudek.party.basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
class Person0 {

    private TelephoneNumber0 number;
    private Address0         address;
    private EmailAddress0    email;
}
