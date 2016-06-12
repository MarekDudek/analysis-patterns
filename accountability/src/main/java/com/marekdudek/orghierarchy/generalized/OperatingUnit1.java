package com.marekdudek.orghierarchy.generalized;

import com.google.common.base.Preconditions;

import java.util.ArrayList;

class OperatingUnit1 extends Organization1 {

    OperatingUnit1(final String name) {
        super(null, name, new ArrayList<>());
    }

    @Override
    public void ensureParentConstraint(final Organization1 parent) {
        Preconditions.checkArgument(parent == null);
    }
}
