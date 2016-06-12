package com.marekdudek.orghierarchy.twohierarchies;

import java.util.Collection;

abstract class Organization2 implements Acceptor2 {

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
        if (salesParent != null)
            salesParent.salesSubsidiaries.add(this);

        serviceParent = serviceP;
        serviceSubsidiaries = serviceSubs;
        if (serviceParent != null)
            serviceParent.serviceSubsidiaries.add(this);
    }

    @Override
    public void salesAccept(final Visitor2 visitor) {
        visitor.visit(this);
        if (salesSubsidiaries != null)
            salesSubsidiaries.forEach(s -> s.salesAccept(visitor));
    }

    @Override
    public void serviceAccept(final Visitor2 visitor) {
        visitor.visit(this);
        if (serviceSubsidiaries != null)
            serviceSubsidiaries.forEach(s -> s.serviceAccept(visitor));
    }
}
