package com.marekdudek.party;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

public class PartyTest {

    @Test
    public void person() {

        final Party1 person =
                new Person1(
                        new TelephoneNumber1("+48507238827"),
                        new Address1("ul. Polna 7/12, Wroclaw, Poland"),
                        new EmailAddress1("jan.kowalski@gmail.com")
                );

        assertThat(person.getAddress(), is(notNullValue()));
    }

    @Test
    public void company() {

        final Party1 company =
                new Company1(
                        new TelephoneNumber1("+480713517503"),
                        new Address1("pl. Grunwaldzki 8, Wroclaw, Poland"),
                        new EmailAddress1("biuro@spolkazoo.pl")
                );

        assertThat(company.getAddress(), is(notNullValue()));
    }
}
