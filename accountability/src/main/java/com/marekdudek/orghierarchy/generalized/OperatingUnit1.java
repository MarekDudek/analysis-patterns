package com.marekdudek.orghierarchy.generalized;

import static com.google.common.base.Preconditions.checkArgument;

class OperatingUnit1 extends Organization1 {

    OperatingUnit1(final String name) {
        super(null, name);
    }

    @Override
    public void ensureParentConstraint(final Organization1 parent) {
        checkArgument(parent == null);
    }

    @Override
    public boolean canHaveSubsidiaries() {
        return true;
    }

    @Override
    public void ensureSubsidiaryTypeConstraint(final Organization1 subsidiary) {
        checkArgument(subsidiary instanceof Region1);
    }
}
