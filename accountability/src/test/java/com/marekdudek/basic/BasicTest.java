package com.marekdudek.basic;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

public class BasicTest {

    @Test
    public void person() {

        final Person0 person =
                new Person0(
                        new TelephoneNumber0("+48507238827"),
                        new Address0("ul. Polna 7/12, Wroclaw, Poland"),
                        new EmailAddress0("jan.kowalski@gmail.com")
                );

        assertThat(person.getAddress(), is(notNullValue()));
    }

    @Test
    public void company() {

        final Company0 company =
                new Company0(
                        new TelephoneNumber0("+480713517503"),
                        new Address0("pl. Grunwaldzki 8, Wroclaw, Poland"),
                        new EmailAddress0("biuro@spolkazoo.pl")
                );

        assertThat(company.getAddress(), is(notNullValue()));
    }
}
