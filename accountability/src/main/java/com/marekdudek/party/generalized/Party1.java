package com.marekdudek.party.generalized;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
abstract class Party1 {

    private TelephoneNumber1 number;
    private Address1         address;
    private EmailAddress1    email;
}
