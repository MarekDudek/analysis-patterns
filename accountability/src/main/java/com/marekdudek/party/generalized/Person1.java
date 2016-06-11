package com.marekdudek.party.generalized;

import lombok.ToString;

@ToString(callSuper = true)
class Person1 extends Party1 {

    Person1(final TelephoneNumber1 number, final Address1 address, final EmailAddress1 email) {
        super(number, address, email);
    }
}
