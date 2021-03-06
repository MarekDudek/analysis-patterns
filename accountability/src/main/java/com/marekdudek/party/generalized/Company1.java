package com.marekdudek.party.generalized;

import lombok.ToString;

@ToString(callSuper = true)
class Company1 extends Party1 {

    Company1(final TelephoneNumber1 number, final Address1 address, final EmailAddress1 email) {
        super(number, address, email);
    }
}
