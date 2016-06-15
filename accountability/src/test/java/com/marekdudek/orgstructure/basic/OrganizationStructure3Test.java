package com.marekdudek.orgstructure.basic;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static com.marekdudek.orgstructure.basic.OrganizationStructureType3.SALES;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class OrganizationStructure3Test {

    // when

    private OperatingUnit3 us;

    private Region3 northeast;
    private Region3 midwest;

    private Division3 newEngland;
    private Division3 eastNorthCentral;

    private SalesOffice3 connecticut;
    private SalesOffice3 illinois;

    @Before
    public void setUp() {

        us = new OperatingUnit3("United States");

        northeast = new Region3(us, "Northeast");
        newEngland = new Division3(northeast, "New England");
        connecticut = new SalesOffice3(newEngland, "Connecticut");

        midwest = new Region3("Midwest");
        eastNorthCentral = new Division3("East North Central");
        illinois = new SalesOffice3("Illinois");
    }

    @Test
    public void parents_of_organizations_should_be_properly_connected() {

        // then

        assertThat(us.getParent(SALES), is(nullValue()));

        assertThat(northeast.getParent(SALES), is(us));
        assertThat(midwest.getParent(SALES), is(nullValue()));

        assertThat(newEngland.getParent(SALES), is(northeast));
        assertThat(eastNorthCentral.getParent(SALES), is(nullValue()));

        assertThat(connecticut.getParent(SALES), is(newEngland));
        assertThat(illinois.getParent(SALES), is(nullValue()));
    }

    @Test
    public void subsidiaries_of_operating_unit_should_be_properly_connected() {
        // then
        final Set<Organization3> subs = us.getSubsidiaries(SALES);
        assertThat(subs, hasSize(1));
        assertThat(subs, hasItem(northeast));
    }

    @Test
    public void subsidiaries_of_region_should_be_properly_connected() {
        // then
        final Set<Organization3> subs = northeast.getSubsidiaries(SALES);
        assertThat(subs, hasSize(1));
        assertThat(subs, hasItem(newEngland));
    }

    @Test
    public void subsidiaries_of_division_should_be_properly_connected() {
        // then
        final Set<Organization3> subs = newEngland.getSubsidiaries(SALES);
        assertThat(subs, hasSize(1));
        assertThat(subs, hasItem(connecticut));
    }

    @Test
    public void subsidiaries_of_sales_office_should_be_properly_connected() {
        // then
        final Set<Organization3> subs = connecticut.getSubsidiaries(SALES);
        assertThat(subs, is(empty()));
    }

    @Test
    public void assigning_parent() {
        // when
        midwest.setParent(us, SALES);
        // then
        assertThat(midwest.getParent(SALES), is(us));
        // when
        final Set<Organization3> subs = us.getSubsidiaries(SALES);
        // then
        assertThat(subs, hasSize(2));
        assertThat(subs, hasItem(northeast));
        assertThat(subs, hasItem(midwest));
    }

    @Test
    public void changing_parent() {
        // when
        newEngland.setParent(midwest, SALES);
        // then
        assertThat(newEngland.getParent(SALES), is(midwest));
        // when
        final Set<Organization3> subs = midwest.getSubsidiaries(SALES);
        assertThat(subs, hasSize(1));
        assertThat(subs, hasItem(newEngland));

        final Set<Organization3> prev = northeast.getSubsidiaries(SALES);
        assertThat(prev, is(empty()));
    }
}
