package com.marekdudek.orghierarchy.generalized;

import java.util.HashSet;

import static com.google.common.base.Preconditions.checkArgument;

class OperatingUnit1 extends Organization1 {

    OperatingUnit1(final String name) {
        super(null, name, new HashSet<>());
    }

    @Override
    public void ensureParentConstraint(final Organization1 parent) {
        checkArgument(parent == null);
    }

    @Override
    public void ensureSubsidiaryConstraint(final Organization1 subsidiary) {
        checkArgument(subsidiary instanceof Region1);
    }
}
