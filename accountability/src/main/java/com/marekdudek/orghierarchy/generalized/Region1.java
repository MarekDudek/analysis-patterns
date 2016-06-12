package com.marekdudek.orghierarchy.generalized;

import com.google.common.base.Preconditions;

import java.util.ArrayList;

class Region1 extends Organization1 {

    Region1(final OperatingUnit1 unit, final String name) {
        super(unit, name, new ArrayList<>());
    }

    @Override
    public void ensureParentConstraint(final Organization1 parent) {
        Preconditions.checkNotNull(parent);
        Preconditions.checkArgument(parent instanceof OperatingUnit1);
    }
}
