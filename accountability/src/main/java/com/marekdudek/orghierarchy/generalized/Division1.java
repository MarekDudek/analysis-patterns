package com.marekdudek.orghierarchy.generalized;

import com.google.common.base.Preconditions;

import java.util.ArrayList;

class Division1 extends Organization1 {

    Division1(final Region1 region, final String name) {
        super(region, name, new ArrayList<>());
    }

    @Override
    public void ensureParentConstraint(final Organization1 parent) {
        Preconditions.checkNotNull(parent);
        Preconditions.checkArgument(parent instanceof Region1);
    }
}
