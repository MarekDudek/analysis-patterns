package com.marekdudek.orghierarchy.twohierarchies;

import java.util.Collection;

abstract class Organization2 {

    private String name;

    private Organization2             salesParent;
    private Collection<Organization2> salesSubsidiaries;

    private Organization2             serviceParent;
    private Collection<Organization2> serviceSubsidiaries;

    Organization2(final String n,
                  final Organization2 salesP, final Collection<Organization2> salesSubs,
                  final Organization2 serviceP, final Collection<Organization2> serviceSubs) {

        name = n;

        salesParent = salesP;
        salesSubsidiaries = salesSubs;
        if (salesParent != null) {
            salesParent.salesSubsidiaries.add(this);
        }

        serviceParent = serviceP;
        serviceSubsidiaries = serviceSubs;
        if (serviceParent != null) {
            serviceParent.serviceSubsidiaries.add(this);
        }
    }
}
