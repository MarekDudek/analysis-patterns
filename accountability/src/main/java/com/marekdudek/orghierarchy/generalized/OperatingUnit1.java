package com.marekdudek.orghierarchy.generalized;

import java.util.ArrayList;

import static com.google.common.base.Preconditions.checkArgument;

class OperatingUnit1 extends Organization1 {

    OperatingUnit1(final String name) {
        super(null, name, new ArrayList<>());
    }

    @Override
    public void ensureParentConstraint(final Organization1 parent) {
        checkArgument(parent == null);
    }
}
