package com.marekdudek.orghierarchy.generalized;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class Organization1HierarchyTest {

    @Test
    public void generic_multinational() {

        // based on Census Bureau-designated regions and divisions

        final OperatingUnit1 us = new OperatingUnit1("United States");

        final Region1 northeast = new Region1(us, "Northeast");
        final Region1 midwest   = new Region1(us, "Midwest");
        final Region1 south     = new Region1(us, "South");
        final Region1 west      = new Region1(us, "West");

        final Division1 newEngland  = new Division1(northeast, "New England");
        final Division1 midAtlantic = new Division1(northeast, "Mid-Atlantic");

        final SalesOffice1 connecticut   = new SalesOffice1(newEngland, "Connecticut");
        final SalesOffice1 maine         = new SalesOffice1(newEngland, "Maine");
        final SalesOffice1 massachusetts = new SalesOffice1(newEngland, "Massachusetts");
        final SalesOffice1 newHampshire  = new SalesOffice1(newEngland, "New Hampshire");
        final SalesOffice1 rhodeIsland   = new SalesOffice1(newEngland, "Rhode Island");
        final SalesOffice1 vermont       = new SalesOffice1(newEngland, "Vermont");

        final SalesOffice1 newJersey    = new SalesOffice1(midAtlantic, "New Jersey");
        final SalesOffice1 newYork      = new SalesOffice1(midAtlantic, "New York");
        final SalesOffice1 pennsylvania = new SalesOffice1(midAtlantic, "Pennsylvania");

        final Division1 eastNorthCentral = new Division1(midwest, "East North Central");
        final Division1 westNorthCentral = new Division1(midwest, "West North Central");

        final SalesOffice1 illinois  = new SalesOffice1(eastNorthCentral, "Illinois");
        final SalesOffice1 indiana   = new SalesOffice1(eastNorthCentral, "Indiana");
        final SalesOffice1 michigan  = new SalesOffice1(eastNorthCentral, "Michigan");
        final SalesOffice1 ohio      = new SalesOffice1(eastNorthCentral, "Ohio");
        final SalesOffice1 wisconsin = new SalesOffice1(eastNorthCentral, "Wisconsin");

        final SalesOffice1 iowa        = new SalesOffice1(westNorthCentral, "Iowa");
        final SalesOffice1 kansas      = new SalesOffice1(westNorthCentral, "Kansas");
        final SalesOffice1 minnesota   = new SalesOffice1(westNorthCentral, "Minnesota");
        final SalesOffice1 missouri    = new SalesOffice1(westNorthCentral, "Missouri");
        final SalesOffice1 nebraska    = new SalesOffice1(westNorthCentral, "Nebraska");
        final SalesOffice1 northDakota = new SalesOffice1(westNorthCentral, "North Dakota");
        final SalesOffice1 southDakota = new SalesOffice1(westNorthCentral, "South Dakota");

        final Division1 southAtlantic    = new Division1(south, "South Atlantic");
        final Division1 eastSouthCentral = new Division1(south, "East South Central");
        final Division1 westSouthCentral = new Division1(south, "West South Central");

        final SalesOffice1 delaware      = new SalesOffice1(southAtlantic, "Delaware");
        final SalesOffice1 florida       = new SalesOffice1(southAtlantic, "Florida");
        final SalesOffice1 georgia       = new SalesOffice1(southAtlantic, "Georgia");
        final SalesOffice1 maryland      = new SalesOffice1(southAtlantic, "Maryland");
        final SalesOffice1 northCarolina = new SalesOffice1(southAtlantic, "North Carolina");
        final SalesOffice1 southCarolina = new SalesOffice1(southAtlantic, "South Carolina");
        final SalesOffice1 virginia      = new SalesOffice1(southAtlantic, "Virginia");
        final SalesOffice1 washingtonDc  = new SalesOffice1(southAtlantic, "Washington DC");
        final SalesOffice1 westVirginia  = new SalesOffice1(southAtlantic, "West Virginia");

        final SalesOffice1 alabama     = new SalesOffice1(eastSouthCentral, "Alabama");
        final SalesOffice1 kentucky    = new SalesOffice1(eastSouthCentral, "Kentucky");
        final SalesOffice1 mississippi = new SalesOffice1(eastSouthCentral, "Mississippi");
        final SalesOffice1 tennessee   = new SalesOffice1(eastSouthCentral, "Tennessee");

        final SalesOffice1 arkansas  = new SalesOffice1(westSouthCentral, "Arkansas");
        final SalesOffice1 louisiana = new SalesOffice1(westSouthCentral, "Louisiana");
        final SalesOffice1 oklahoma  = new SalesOffice1(westSouthCentral, "Oklahoma");
        final SalesOffice1 texas     = new SalesOffice1(westSouthCentral, "Texas");

        final Division1 mountain = new Division1(west, "Mountains");
        final Division1 pacific  = new Division1(west, "Pacific");

        final SalesOffice1 arizona   = new SalesOffice1(mountain, "Arizona");
        final SalesOffice1 colorado  = new SalesOffice1(mountain, "Colorado");
        final SalesOffice1 idaho     = new SalesOffice1(mountain, "Idaho");
        final SalesOffice1 montana   = new SalesOffice1(mountain, "Montana");
        final SalesOffice1 nevada    = new SalesOffice1(mountain, "Nevada");
        final SalesOffice1 newMexico = new SalesOffice1(mountain, "New Mexico");
        final SalesOffice1 utah      = new SalesOffice1(mountain, "Utah");
        final SalesOffice1 wyoming   = new SalesOffice1(mountain, "Wyoming");

        final SalesOffice1 alaska     = new SalesOffice1(pacific, "Alaska");
        final SalesOffice1 california = new SalesOffice1(pacific, "California");
        final SalesOffice1 hawaii     = new SalesOffice1(pacific, "Hawaii");
        final SalesOffice1 oregon     = new SalesOffice1(pacific, "Oregon");
        final SalesOffice1 washington = new SalesOffice1(pacific, "Washington");

        final Collection<SalesOffice1> offices = Arrays.asList(
                alabama, alaska, arizona, arkansas,
                california, colorado, connecticut,
                delaware, florida, georgia, hawaii,
                idaho, illinois, indiana, iowa,
                kansas, kentucky, louisiana,
                maine, maryland, massachusetts, michigan, minnesota, mississippi, missouri, montana,
                nebraska, nevada, newHampshire, newJersey, newMexico, newYork, northCarolina, northDakota,
                ohio, oklahoma, oregon,
                pennsylvania, rhodeIsland,
                southCarolina, southDakota,
                tennessee, texas,
                utah, vermont, virginia,
                washington, westVirginia, wisconsin, wyoming,
                washingtonDc);

        assertThat(offices, hasSize(51));

        final HierarchyDisplayBuilder visitor = new HierarchyDisplayBuilder();
        us.accept(visitor);

        // System.out.println(visitor.hierarchy.toString());
    }

    private class HierarchyDisplayBuilder implements Visitor1 {

        StringBuilder hierarchy = new StringBuilder();

        @Override
        public void visit(final Organization1 organization1) {

            if (organization1 instanceof OperatingUnit1)
                hierarchy.append("+ ");
            if (organization1 instanceof Region1)
                hierarchy.append("  + ");
            if (organization1 instanceof Division1)
                hierarchy.append("    + ");
            if (organization1 instanceof SalesOffice1)
                hierarchy.append("      + ");

            hierarchy.
                    append(organization1.getName()).
                    append(String.format("%n"));
        }
    }

    @Rule
    public ExpectedException exc = ExpectedException.none();

    @Test
    public void operating_unit_must_not_have_parent() {
        // given
        final OperatingUnit1 unit = new OperatingUnit1("unit");
        // then
        exc.expect(IllegalArgumentException.class);
        // when
        unit.setParent(unit);
    }

    @Test
    public void region_must_have_parent_operating_unit() {
        // given
        final Region1 region = new Region1(new OperatingUnit1("unit"), "region");
        // then
        exc.expect(IllegalArgumentException.class);
        // when
        region.setParent(region);
    }

    @Test
    public void division_must_have_parent_region() {
        // given
        final Division1 division =
                new Division1(new Region1(new OperatingUnit1("unit"), "region"), "division");
        // then
        exc.expect(IllegalArgumentException.class);
        // when
        division.setParent(division);
    }

    @Test
    public void sales_office_must_have_parent_division() {
        // given
        final SalesOffice1 office =
                new SalesOffice1(new Division1(new Region1(new OperatingUnit1("unit"), "region"), "division"), "office");
        // then
        exc.expect(IllegalArgumentException.class);
        // when
        office.setParent(office);
    }
}
