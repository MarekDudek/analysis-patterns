package com.marekdudek.orghierarchy.generalized;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

class SalesOffice1 extends Organization1 {

    SalesOffice1(final Division1 division, final String name) {
        super(division, name, null);
    }

    @Override
    public void ensureParentConstraint(final Organization1 parent) {
        checkNotNull(parent);
        checkArgument(parent instanceof Division1);
    }

    @Override
    public void ensureSubsidiaryConstraint(final Organization1 subsidiary) {
        checkArgument(false);
    }
}
