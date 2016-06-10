package com.marekdudek.party;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
abstract class Party1 {

    private TelephoneNumber1 number;
    private Address1         address;
    private EmailAddress1    email;
}
