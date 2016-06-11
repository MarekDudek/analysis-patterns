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

        final OperatingUnit0 us = new OperatingUnit0();

        final Region0 northeast = new Region0(us);
        final Region0 midwest   = new Region0(us);
        final Region0 south     = new Region0(us);
        final Region0 west      = new Region0(us);

        final Division0 newEngland  = new Division0(northeast);
        final Division0 midAtlantic = new Division0(northeast);

        final Division0 eastNorthCentral = new Division0(midwest);
        final Division0 westNorthCentral = new Division0(midwest);

        final Division0 southAtlantic    = new Division0(south);
        final Division0 eastSouthCentral = new Division0(south);
        final Division0 westSouthCentral = new Division0(south);

        final Division0 mountain = new Division0(west);
        final Division0 pacific  = new Division0(west);

        final SalesOffice0 connecticut   = new SalesOffice0(newEngland);
        final SalesOffice0 maine         = new SalesOffice0(newEngland);
        final SalesOffice0 massachusetts = new SalesOffice0(newEngland);
        final SalesOffice0 newHampshire  = new SalesOffice0(newEngland);
        final SalesOffice0 rhodeIsland   = new SalesOffice0(newEngland);
        final SalesOffice0 vermont       = new SalesOffice0(newEngland);

        final SalesOffice0 newJersey    = new SalesOffice0(midAtlantic);
        final SalesOffice0 newYork      = new SalesOffice0(midAtlantic);
        final SalesOffice0 pennsylvania = new SalesOffice0(midAtlantic);

        final SalesOffice0 illinois  = new SalesOffice0(eastNorthCentral);
        final SalesOffice0 indiana   = new SalesOffice0(eastNorthCentral);
        final SalesOffice0 michigan  = new SalesOffice0(eastNorthCentral);
        final SalesOffice0 ohio      = new SalesOffice0(eastNorthCentral);
        final SalesOffice0 wisconsin = new SalesOffice0(eastNorthCentral);

        final SalesOffice0 iowa        = new SalesOffice0(westNorthCentral);
        final SalesOffice0 kansas      = new SalesOffice0(westNorthCentral);
        final SalesOffice0 minnesota   = new SalesOffice0(westNorthCentral);
        final SalesOffice0 missouri    = new SalesOffice0(westNorthCentral);
        final SalesOffice0 nebraska    = new SalesOffice0(westNorthCentral);
        final SalesOffice0 northDakota = new SalesOffice0(westNorthCentral);
        final SalesOffice0 southDakota = new SalesOffice0(westNorthCentral);

        final SalesOffice0 deleware      = new SalesOffice0(southAtlantic);
        final SalesOffice0 florida       = new SalesOffice0(southAtlantic);
        final SalesOffice0 georgia       = new SalesOffice0(southAtlantic);
        final SalesOffice0 maryland      = new SalesOffice0(southAtlantic);
        final SalesOffice0 northCarolina = new SalesOffice0(southAtlantic);
        final SalesOffice0 southCarolina = new SalesOffice0(southAtlantic);
        final SalesOffice0 virginia      = new SalesOffice0(southAtlantic);
        final SalesOffice0 washingtonDc  = new SalesOffice0(southAtlantic);
        final SalesOffice0 westVirginia  = new SalesOffice0(southAtlantic);

        final SalesOffice0 alabama     = new SalesOffice0(eastSouthCentral);
        final SalesOffice0 kentucky    = new SalesOffice0(eastSouthCentral);
        final SalesOffice0 mississippi = new SalesOffice0(eastSouthCentral);
        final SalesOffice0 tennessee   = new SalesOffice0(eastSouthCentral);

        final SalesOffice0 arkansas  = new SalesOffice0(westSouthCentral);
        final SalesOffice0 louisiana = new SalesOffice0(westSouthCentral);
        final SalesOffice0 oklahoma  = new SalesOffice0(westSouthCentral);
        final SalesOffice0 texas     = new SalesOffice0(westSouthCentral);

        final SalesOffice0 arizona   = new SalesOffice0(mountain);
        final SalesOffice0 colorado  = new SalesOffice0(mountain);
        final SalesOffice0 idaho     = new SalesOffice0(mountain);
        final SalesOffice0 montana   = new SalesOffice0(mountain);
        final SalesOffice0 nevada    = new SalesOffice0(mountain);
        final SalesOffice0 newMexico = new SalesOffice0(mountain);
        final SalesOffice0 utah      = new SalesOffice0(mountain);
        final SalesOffice0 wyoming   = new SalesOffice0(mountain);

        final SalesOffice0 alaska     = new SalesOffice0(pacific);
        final SalesOffice0 california = new SalesOffice0(pacific);
        final SalesOffice0 hawaii     = new SalesOffice0(pacific);
        final SalesOffice0 oregon     = new SalesOffice0(pacific);
        final SalesOffice0 washington = new SalesOffice0(pacific);

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
    }
}
