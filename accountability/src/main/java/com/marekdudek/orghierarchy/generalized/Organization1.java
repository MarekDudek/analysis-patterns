package com.marekdudek.orghierarchy.generalized;

import java.util.Collection;

abstract class Organization1 implements Acceptor1 {

    private String                    name;
    private Organization1             parent;
    private Collection<Organization1> subsidiaries;

    // Constraints on types of parents and subsidiaries enforced by specific constructors

    Organization1(final Organization1 p, final String n, final Collection<Organization1> subs) {
        ensureParentConstraint(p);
        parent = p;
        name = n;
        subsidiaries = subs;
        if (parent != null) {
            parent.subsidiaries.add(this);
        }
    }

    public abstract void ensureParentConstraint(final Organization1 parent);

    @Override
    public final void accept(final Visitor1 visitor) {
        visitor.visit(this);
        if (subsidiaries != null)
            subsidiaries.forEach(s -> s.accept(visitor));
    }

    public void setParent(final Organization1 p) {
        ensureParentConstraint(p);
        parent = p;
    }

    public void setName(final String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public Organization1 getParent() {
        return parent;
    }
}
