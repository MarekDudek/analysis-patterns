package com.marekdudek.orgstructure.basic;

import org.junit.Test;

import java.util.Set;

import static com.marekdudek.orgstructure.basic.OrganizationStructureType3.SALES;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class OrganizationStructure3Test {

    private final OperatingUnit3 us          = new OperatingUnit3("United States");
    private final Region3        northeast   = new Region3(us, "Northeast");
    private final Division3      newEngland  = new Division3(northeast, "New England");
    private final SalesOffice3   connecticut = new SalesOffice3(newEngland, "Connecticut");

    @Test
    public void parents_of_organizations_should_be_properly_connected() {

        assertThat(us.getParents().get(SALES), is(nullValue()));

        assertThat(northeast.getParents().get(SALES).getOrganization(), is(us));
        assertThat(newEngland.getParents().get(SALES).getOrganization(), is(northeast));
        assertThat(connecticut.getParents().get(SALES).getOrganization(), is(newEngland));
    }

    @Test
    public void subsidiaries_of_operating_unit_should_be_properly_connected() {

        final Set<OrganizationStructure3> subs    = us.getSubsidiaries().get(SALES);
        final Organization3               onlySub = subs.iterator().next().getOrganization();

        assertThat(subs, hasSize(1));
        assertThat(onlySub, is(equalTo(northeast)));
    }

    @Test
    public void subsidiaries_of_region_should_be_properly_connected() {

        final Set<OrganizationStructure3> subs    = northeast.getSubsidiaries().get(SALES);
        final Organization3               onlySub = subs.iterator().next().getOrganization();

        assertThat(subs, hasSize(1));
        assertThat(onlySub, is(equalTo(newEngland)));
    }

    @Test
    public void subsidiaries_of_division_should_be_properly_connected() {

        final Set<OrganizationStructure3> subs    = newEngland.getSubsidiaries().get(SALES);
        final Organization3               onlySub = subs.iterator().next().getOrganization();

        assertThat(subs, hasSize(1));
        assertThat(onlySub, is(equalTo(connecticut)));
    }

    @Test
    public void subsidiaries_of_sales_office_should_be_properly_connected() {

        final Set<OrganizationStructure3> subs = connecticut.getSubsidiaries().get(SALES);

        assertThat(subs, is(nullValue()));
    }
}
