package com.marekdudek.orghierarchy.generalized;

import com.google.common.base.Preconditions;

class SalesOffice1 extends Organization1 {

    SalesOffice1(final Division1 division, final String name) {
        super(division, name, null);
    }

    @Override
    public void ensureParentConstraint(final Organization1 parent) {
        Preconditions.checkNotNull(parent);
        Preconditions.checkArgument(parent instanceof Division1);
    }
}
