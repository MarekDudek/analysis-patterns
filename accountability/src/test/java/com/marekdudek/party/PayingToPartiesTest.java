package com.marekdudek.party;

import com.marekdudek.utils.EventBus;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Observable;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class PayingToPartiesTest {

    abstract class Party extends Observable {

        String account;

        void pay() {
            if (account != null) {
                setChanged();
                notifyObservers(account);
            }
        }
    }

    private class Organization extends Party {
    }

    private class Person extends Party {
    }

    @Test
    public void paying_to_bank_account() {

        // should remember my own account
        final Party me = new Person();
        me.account = "GB29 NWBK 6016 1331 9268 19";

        // should service both people
        final Party tomCairns = new Person();

        // and institutions
        final Party stMarys           = new Organization();
        final Party renalUnit         = new Organization();
        final Party parksideAuthority = new Organization();
        final Party rcp               = new Organization();

        stMarys.account = "GB29 NWBK 6016 1331 9268 20";
        renalUnit.account = "GB29 NWBK 6016 1331 9268 21";
        parksideAuthority.account = "GB29 NWBK 6016 1331 9268 22";
        rcp.account = "GB29 NWBK 6016 1331 9268 23";

        // account repository
        final Collection<Party> payable = Arrays.asList(tomCairns, stMarys, renalUnit, parksideAuthority, rcp);

        // paying
        payable.forEach(p -> p.addObserver(eventBus));
        payable.forEach(Party::pay);

        assertThat(eventBus.events(), hasSize(4));
    }

    private EventBus eventBus;

    @Before
    public void setUp() {
        eventBus = new EventBus();
    }
}
