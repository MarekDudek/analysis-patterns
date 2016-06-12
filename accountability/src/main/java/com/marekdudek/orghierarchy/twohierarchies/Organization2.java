package com.marekdudek.orghierarchy.twohierarchies;

import java.util.Collection;

abstract class Organization2 {

    private String name;

    private Organization2             salesParent;
    private Collection<Organization2> salesSubsidiaries;

    private Organization2             productParent;
    private Collection<Organization2> productSubsidiaries;

    Organization2(final String n, final Organization2 sp, final Collection<Organization2> ssubs) {
        name = n;
        salesParent = sp;
        salesSubsidiaries = ssubs;
        if (salesParent != null) {
            salesParent.salesSubsidiaries.add(this);
        }
    }
}
