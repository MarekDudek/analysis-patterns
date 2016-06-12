package com.marekdudek.orghierarchy.generalized;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

class Division1 extends Organization1 {

    Division1(final Region1 region, final String name) {
        super(region, name);
    }

    @Override
    public void ensureParentConstraint(final Organization1 parent) {
        checkNotNull(parent);
        checkArgument(parent instanceof Region1);
    }

    @Override
    public boolean canHaveSubsidiaries() {
        return true;
    }

    @Override
    public void ensureSubsidiaryTypeConstraint(final Organization1 subsidiary) {
        checkArgument(subsidiary instanceof SalesOffice1);
    }
}
