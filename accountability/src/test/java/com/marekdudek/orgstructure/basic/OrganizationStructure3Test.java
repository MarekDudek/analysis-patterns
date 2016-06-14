package com.marekdudek.orgstructure.basic;

import org.junit.Test;

import java.util.Set;

import static com.marekdudek.orgstructure.basic.OrganizationStructureType3.SALES;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class OrganizationStructure3Test {

    // when
    private final OperatingUnit3 us          = new OperatingUnit3("United States");
    private final Region3        northeast   = new Region3(us, "Northeast");
    private final Division3      newEngland  = new Division3(northeast, "New England");
    private final SalesOffice3   connecticut = new SalesOffice3(newEngland, "Connecticut");

    @Test
    public void parents_of_organizations_should_be_properly_connected() {
        // then
        assertThat(us.getParent(SALES), is(nullValue()));
        assertThat(northeast.getParent(SALES), is(us));
        assertThat(newEngland.getParent(SALES), is(northeast));
        assertThat(connecticut.getParent(SALES), is(newEngland));
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
}
