package com.marekdudek.basic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class BasicTest {

    @Test
    public void people_and_companies() {

        // given entries in address book
        final Person0 wife     = new Person0(new TelephoneNumber0("214 321 124"), null, null);
        final Person0 mother   = new Person0(new TelephoneNumber0("564 423 754"), null, null);
        final Person0 son      = new Person0(new TelephoneNumber0("+64 564 423 754"), null, new EmailAddress0("jack@gmail.com"));
        final Person0 daughter = new Person0(new TelephoneNumber0("+64 564 423 754"), null, new EmailAddress0("kate@gmail.com"));

        final Person0 aquaintance = new Person0(null, null, new EmailAddress0("tom.tackson@come-company.com"));
        final Person0 doctor      = new Person0(null, new Address0("North St. 1D"), null);
        final Person0 barber      = new Person0(new TelephoneNumber0("643 124 4311"), null, null);

        final Company0 townTaxi   = new Company0(new TelephoneNumber0("+34 (045) 432 1432"), null, null);
        final Company0 shoemaker  = new Company0(null, new Address0("High Street 12B"), null);
        final Company0 accountant = new Company0(null, null, new EmailAddress0("john.smith@cpa.org"));

        // when we construct addressBook
        final Collection<Company0> companies = Arrays.asList(townTaxi, shoemaker, accountant);
        final Collection<Person0>  people    = Arrays.asList(wife, mother, son, daughter, aquaintance, doctor, barber);

        final Collection<Object> addressBook = new ArrayList<>();
        addressBook.addAll(people);
        addressBook.addAll(companies);

        // then we can say something about its contents
        assertThat(addressBook, hasSize(10));
    }
}
