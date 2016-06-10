package com.marekdudek.party;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class PartyTest {

    public void parties() {

        // given entries in address book
        final Person1 wife     = new Person1(new TelephoneNumber1("214 321 124"), null, null);
        final Person1 mother   = new Person1(new TelephoneNumber1("564 423 754"), null, null);
        final Person1 son      = new Person1(new TelephoneNumber1("+64 564 423 754"), null, new EmailAddress1("jack@gmail.com"));
        final Person1 daughter = new Person1(new TelephoneNumber1("+64 564 423 754"), null, new EmailAddress1("kate@gmail.com"));

        final Person1 acquaintance = new Person1(null, null, new EmailAddress1("tom.tackson@come-company.com"));
        final Person1 doctor       = new Person1(null, new Address1("North St. 1D"), null);
        final Person1 barber       = new Person1(new TelephoneNumber1("643 124 4311"), null, null);

        final Company1 townTaxi   = new Company1(new TelephoneNumber1("+34 (045) 432 1432"), null, null);
        final Company1 shoemaker  = new Company1(null, new Address1("High Street 12B"), null);
        final Company1 accountant = new Company1(null, null, new EmailAddress1("john.smith@cpa.org"));

        // when we construct addressBook
        // (easier and typed)
        final Collection<Party1> addressBook = Arrays.asList(wife, mother, son, daughter, acquaintance, doctor, barber, townTaxi, shoemaker, accountant);

        // then we can say something about its contents
        assertThat(addressBook, hasSize(10));
    }
}
