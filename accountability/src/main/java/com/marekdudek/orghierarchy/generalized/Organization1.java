package com.marekdudek.orghierarchy.generalized;

import java.util.Collection;

abstract class Organization1 {

    private String                    name;
    private Organization1             parent;
    private Collection<Organization1> subsidiaries;

    Organization1(final Organization1 p, final String n, final Collection<Organization1> subs) {
        parent = p;
        name = n;
        subsidiaries = subs;
        if (parent != null) {
            parent.subsidiaries.add(this);
        }
    }
}
