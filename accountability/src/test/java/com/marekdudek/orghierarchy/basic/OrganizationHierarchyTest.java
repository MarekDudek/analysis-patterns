package com.marekdudek.orghierarchy.basic;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class OrganizationHierarchyTest {

    @Test
    public void generic_multinational() {

        // based on Census Bureau-designated regions and divisions

        final OperatingUnit0 us = new OperatingUnit0("United States");

        final Region0 northeast = new Region0(us, "Northeast");
        final Region0 midwest   = new Region0(us, "Midwest");
        final Region0 south     = new Region0(us, "South");
        final Region0 west      = new Region0(us, "West");

        final Division0 newEngland  = new Division0(northeast, "New England");
        final Division0 midAtlantic = new Division0(northeast, "Mid-Atlantic");

        final SalesOffice0 connecticut   = new SalesOffice0(newEngland, "Connecticut");
        final SalesOffice0 maine         = new SalesOffice0(newEngland, "Maine");
        final SalesOffice0 massachusetts = new SalesOffice0(newEngland, "Massachusetts");
        final SalesOffice0 newHampshire  = new SalesOffice0(newEngland, "New Hampshire");
        final SalesOffice0 rhodeIsland   = new SalesOffice0(newEngland, "Rhode Island");
        final SalesOffice0 vermont       = new SalesOffice0(newEngland, "Vermont");

        final SalesOffice0 newJersey    = new SalesOffice0(midAtlantic, "New Jersey");
        final SalesOffice0 newYork      = new SalesOffice0(midAtlantic, "New York");
        final SalesOffice0 pennsylvania = new SalesOffice0(midAtlantic, "Pennsylvania");

        final Division0 eastNorthCentral = new Division0(midwest, "East North Central");
        final Division0 westNorthCentral = new Division0(midwest, "West North Central");

        final SalesOffice0 illinois  = new SalesOffice0(eastNorthCentral, "Illinois");
        final SalesOffice0 indiana   = new SalesOffice0(eastNorthCentral, "Indiana");
        final SalesOffice0 michigan  = new SalesOffice0(eastNorthCentral, "Michigan");
        final SalesOffice0 ohio      = new SalesOffice0(eastNorthCentral, "Ohio");
        final SalesOffice0 wisconsin = new SalesOffice0(eastNorthCentral, "Wisconsin");

        final SalesOffice0 iowa        = new SalesOffice0(westNorthCentral, "Iowa");
        final SalesOffice0 kansas      = new SalesOffice0(westNorthCentral, "Kansas");
        final SalesOffice0 minnesota   = new SalesOffice0(westNorthCentral, "Minnesota");
        final SalesOffice0 missouri    = new SalesOffice0(westNorthCentral, "Missouri");
        final SalesOffice0 nebraska    = new SalesOffice0(westNorthCentral, "Nebraska");
        final SalesOffice0 northDakota = new SalesOffice0(westNorthCentral, "North Dakota");
        final SalesOffice0 southDakota = new SalesOffice0(westNorthCentral, "South Dakota");

        final Division0 southAtlantic    = new Division0(south, "South Atlantic");
        final Division0 eastSouthCentral = new Division0(south, "East South Central");
        final Division0 westSouthCentral = new Division0(south, "West South Central");

        final SalesOffice0 deleware      = new SalesOffice0(southAtlantic, "Deleware");
        final SalesOffice0 florida       = new SalesOffice0(southAtlantic, "Florida");
        final SalesOffice0 georgia       = new SalesOffice0(southAtlantic, "Georgia");
        final SalesOffice0 maryland      = new SalesOffice0(southAtlantic, "Maryland");
        final SalesOffice0 northCarolina = new SalesOffice0(southAtlantic, "North Carolina");
        final SalesOffice0 southCarolina = new SalesOffice0(southAtlantic, "South Carolina");
        final SalesOffice0 virginia      = new SalesOffice0(southAtlantic, "Virginia");
        final SalesOffice0 washingtonDc  = new SalesOffice0(southAtlantic, "Washington DC");
        final SalesOffice0 westVirginia  = new SalesOffice0(southAtlantic, "West Virginia");

        final SalesOffice0 alabama     = new SalesOffice0(eastSouthCentral, "Alabama");
        final SalesOffice0 kentucky    = new SalesOffice0(eastSouthCentral, "Kentucky");
        final SalesOffice0 mississippi = new SalesOffice0(eastSouthCentral, "Mississippi");
        final SalesOffice0 tennessee   = new SalesOffice0(eastSouthCentral, "Tennessee");

        final SalesOffice0 arkansas  = new SalesOffice0(westSouthCentral, "Arkansas");
        final SalesOffice0 louisiana = new SalesOffice0(westSouthCentral, "Louisiana");
        final SalesOffice0 oklahoma  = new SalesOffice0(westSouthCentral, "Oklahoma");
        final SalesOffice0 texas     = new SalesOffice0(westSouthCentral, "Texas");

        final Division0 mountain = new Division0(west, "Mountains");
        final Division0 pacific  = new Division0(west, "Pacific");

        final SalesOffice0 arizona   = new SalesOffice0(mountain, "Arizona");
        final SalesOffice0 colorado  = new SalesOffice0(mountain, "Colorado");
        final SalesOffice0 idaho     = new SalesOffice0(mountain, "Idaho");
        final SalesOffice0 montana   = new SalesOffice0(mountain, "Montana");
        final SalesOffice0 nevada    = new SalesOffice0(mountain, "Nevada");
        final SalesOffice0 newMexico = new SalesOffice0(mountain, "New Mexico");
        final SalesOffice0 utah      = new SalesOffice0(mountain, "Utah");
        final SalesOffice0 wyoming   = new SalesOffice0(mountain, "Wyoming");

        final SalesOffice0 alaska     = new SalesOffice0(pacific, "Alaska");
        final SalesOffice0 california = new SalesOffice0(pacific, "California");
        final SalesOffice0 hawaii     = new SalesOffice0(pacific, "Hawaii");
        final SalesOffice0 oregon     = new SalesOffice0(pacific, "Oregon");
        final SalesOffice0 washington = new SalesOffice0(pacific, "Washington");

        final Collection<SalesOffice0> offices = Arrays.asList(
                alabama, alaska, arizona, arkansas,
                california, colorado, connecticut,
                deleware, florida, georgia, hawaii,
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

    private class HierarchyDisplayBuilder implements Visitor0 {

        StringBuilder hierarchy = new StringBuilder();

        @Override
        public void visit(final OperatingUnit0 unit) {
            hierarchy.
                    append("+ ").
                    append(unit.getName()).
                    append(String.format("%n"));
        }

        @Override
        public void visit(final Region0 region) {
            hierarchy.
                    append("  + ").
                    append(region.getName()).
                    append(String.format("%n"));
        }

        @Override
        public void visit(final Division0 division) {
            hierarchy.
                    append("    + ").
                    append(division.getName()).
                    append(String.format("%n"));
        }

        @Override
        public void visit(final SalesOffice0 office) {
            hierarchy.
                    append("      + ").
                    append(office.getName()).
                    append(String.format("%n"));
        }
    }
}
