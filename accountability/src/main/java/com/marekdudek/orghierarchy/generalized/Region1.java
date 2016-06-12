package com.marekdudek.orghierarchy.generalized;

import java.util.ArrayList;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

class Region1 extends Organization1 {

    Region1(final OperatingUnit1 unit, final String name) {
        super(unit, name, new ArrayList<>());
    }

    @Override
    public void ensureParentConstraint(final Organization1 parent) {
        checkNotNull(parent);
        checkArgument(parent instanceof OperatingUnit1);
    }
}
