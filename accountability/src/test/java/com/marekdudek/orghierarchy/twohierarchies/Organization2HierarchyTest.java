package com.marekdudek.orghierarchy.twohierarchies;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class Organization2HierarchyTest {

    @Test
    public void generic_multinational_sales_hierarchy() {

        // based on Census Bureau-designated regions and divisions

        final OperatingUnit2 us = new OperatingUnit2("United States");

        final Region2 northeast = new Region2(us, "Northeast");
        final Region2 midwest   = new Region2(us, "Midwest");
        final Region2 south     = new Region2(us, "South");
        final Region2 west      = new Region2(us, "West");

        final Division2 newEngland  = new Division2(northeast, "New England");
        final Division2 midAtlantic = new Division2(northeast, "Mid-Atlantic");

        final SalesOffice2 connecticut   = new SalesOffice2(newEngland, "Connecticut");
        final SalesOffice2 maine         = new SalesOffice2(newEngland, "Maine");
        final SalesOffice2 massachusetts = new SalesOffice2(newEngland, "Massachusetts");
        final SalesOffice2 newHampshire  = new SalesOffice2(newEngland, "New Hampshire");
        final SalesOffice2 rhodeIsland   = new SalesOffice2(newEngland, "Rhode Island");
        final SalesOffice2 vermont       = new SalesOffice2(newEngland, "Vermont");

        final SalesOffice2 newJersey    = new SalesOffice2(midAtlantic, "New Jersey");
        final SalesOffice2 newYork      = new SalesOffice2(midAtlantic, "New York");
        final SalesOffice2 pennsylvania = new SalesOffice2(midAtlantic, "Pennsylvania");

        final Division2 eastNorthCentral = new Division2(midwest, "East North Central");
        final Division2 westNorthCentral = new Division2(midwest, "West North Central");

        final SalesOffice2 illinois  = new SalesOffice2(eastNorthCentral, "Illinois");
        final SalesOffice2 indiana   = new SalesOffice2(eastNorthCentral, "Indiana");
        final SalesOffice2 michigan  = new SalesOffice2(eastNorthCentral, "Michigan");
        final SalesOffice2 ohio      = new SalesOffice2(eastNorthCentral, "Ohio");
        final SalesOffice2 wisconsin = new SalesOffice2(eastNorthCentral, "Wisconsin");

        final SalesOffice2 iowa        = new SalesOffice2(westNorthCentral, "Iowa");
        final SalesOffice2 kansas      = new SalesOffice2(westNorthCentral, "Kansas");
        final SalesOffice2 minnesota   = new SalesOffice2(westNorthCentral, "Minnesota");
        final SalesOffice2 missouri    = new SalesOffice2(westNorthCentral, "Missouri");
        final SalesOffice2 nebraska    = new SalesOffice2(westNorthCentral, "Nebraska");
        final SalesOffice2 northDakota = new SalesOffice2(westNorthCentral, "North Dakota");
        final SalesOffice2 southDakota = new SalesOffice2(westNorthCentral, "South Dakota");

        final Division2 southAtlantic    = new Division2(south, "South Atlantic");
        final Division2 eastSouthCentral = new Division2(south, "East South Central");
        final Division2 westSouthCentral = new Division2(south, "West South Central");

        final SalesOffice2 delaware      = new SalesOffice2(southAtlantic, "Delaware");
        final SalesOffice2 florida       = new SalesOffice2(southAtlantic, "Florida");
        final SalesOffice2 georgia       = new SalesOffice2(southAtlantic, "Georgia");
        final SalesOffice2 maryland      = new SalesOffice2(southAtlantic, "Maryland");
        final SalesOffice2 northCarolina = new SalesOffice2(southAtlantic, "North Carolina");
        final SalesOffice2 southCarolina = new SalesOffice2(southAtlantic, "South Carolina");
        final SalesOffice2 virginia      = new SalesOffice2(southAtlantic, "Virginia");
        final SalesOffice2 washingtonDc  = new SalesOffice2(southAtlantic, "Washington DC");
        final SalesOffice2 westVirginia  = new SalesOffice2(southAtlantic, "West Virginia");

        final SalesOffice2 alabama     = new SalesOffice2(eastSouthCentral, "Alabama");
        final SalesOffice2 kentucky    = new SalesOffice2(eastSouthCentral, "Kentucky");
        final SalesOffice2 mississippi = new SalesOffice2(eastSouthCentral, "Mississippi");
        final SalesOffice2 tennessee   = new SalesOffice2(eastSouthCentral, "Tennessee");

        final SalesOffice2 arkansas  = new SalesOffice2(westSouthCentral, "Arkansas");
        final SalesOffice2 louisiana = new SalesOffice2(westSouthCentral, "Louisiana");
        final SalesOffice2 oklahoma  = new SalesOffice2(westSouthCentral, "Oklahoma");
        final SalesOffice2 texas     = new SalesOffice2(westSouthCentral, "Texas");

        final Division2 mountain = new Division2(west, "Mountains");
        final Division2 pacific  = new Division2(west, "Pacific");

        final SalesOffice2 arizona   = new SalesOffice2(mountain, "Arizona");
        final SalesOffice2 colorado  = new SalesOffice2(mountain, "Colorado");
        final SalesOffice2 idaho     = new SalesOffice2(mountain, "Idaho");
        final SalesOffice2 montana   = new SalesOffice2(mountain, "Montana");
        final SalesOffice2 nevada    = new SalesOffice2(mountain, "Nevada");
        final SalesOffice2 newMexico = new SalesOffice2(mountain, "New Mexico");
        final SalesOffice2 utah      = new SalesOffice2(mountain, "Utah");
        final SalesOffice2 wyoming   = new SalesOffice2(mountain, "Wyoming");

        final SalesOffice2 alaska     = new SalesOffice2(pacific, "Alaska");
        final SalesOffice2 california = new SalesOffice2(pacific, "California");
        final SalesOffice2 hawaii     = new SalesOffice2(pacific, "Hawaii");
        final SalesOffice2 oregon     = new SalesOffice2(pacific, "Oregon");
        final SalesOffice2 washington = new SalesOffice2(pacific, "Washington");

        final Collection<SalesOffice2> offices = Arrays.asList(
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
                washingtonDc
        );

        assertThat(offices, hasSize(51));
    }

    @Test
    public void generic_multinational_service_hierarchy() {

        final ProductTypeServiceDivision coffee =
                new ProductTypeServiceDivision("Coffee products service division");

        final ProductSubtypeServiceDivision highVolumeItalian =
                new ProductSubtypeServiceDivision(coffee, "High-volume Italian coffee products service division");

        final ProductFamilyServiceTeam family217x =
                new ProductFamilyServiceTeam(highVolumeItalian, "217x family service center");

        final ProductServiceTeam boston2176 =
                new ProductServiceTeam(family217x, "2176 Boston");

        // System.out.println(coffee);
    }

    @Test
    public void generic_multinational() {

    }
}
