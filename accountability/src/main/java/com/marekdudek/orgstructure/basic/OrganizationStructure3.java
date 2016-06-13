package com.marekdudek.orgstructure.basic;

import java.time.Period;

public class OrganizationStructure3 {

    private Organization3              organization;
    private OrganizationStructureType3 type;
    private Period                     period;

    public OrganizationStructure3(final Organization3 org, final OrganizationStructureType3 t) {
        organization = org;
        type = t;
    }
}
