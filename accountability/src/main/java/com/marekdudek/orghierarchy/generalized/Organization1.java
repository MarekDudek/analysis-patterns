package com.marekdudek.orghierarchy.generalized;

import java.util.Set;

abstract class Organization1 implements Acceptor1 {

    private String             name;
    private Organization1      parent;
    private Set<Organization1> subsidiaries;

    // Constraints on types of parents and subsidiaries enforced by specific constructors

    Organization1(final Organization1 p, final String n, final Set<Organization1> subs) {
        name = n;
        setParent(p);
        subsidiaries = subs;
        if (subsidiaries != null)
            subsidiaries.forEach(this::ensureSubsidiaryConstraint);
    }

    public abstract void ensureParentConstraint(final Organization1 parent);

    public abstract void ensureSubsidiaryConstraint(final Organization1 subsidiary);

    @Override
    public final void accept(final Visitor1 visitor) {
        visitor.visit(this);
        if (subsidiaries != null)
            subsidiaries.forEach(s -> s.accept(visitor));
    }

    public final void setParent(final Organization1 p) {
        ensureParentConstraint(p);
        if (p != null)
            p.ensureSubsidiaryConstraint(this);
        parent = p;
        if (parent != null)
            parent.subsidiaries.add(this);
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
