package com.marekdudek.orghierarchy.generalized;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

abstract class Organization1 implements Acceptor1 {

    private String             name;
    private Organization1      parent;
    private Set<Organization1> subsidiaries;

    Organization1(final Organization1 p, final String n) {
        name = n;
        setParent(p);
        if (canHaveSubsidiaries())
            subsidiaries = new HashSet<>();
    }

    public abstract void ensureParentConstraint(Organization1 parent);

    public abstract boolean canHaveSubsidiaries();

    public abstract void ensureSubsidiaryTypeConstraint(Organization1 subsidiary);

    @Override
    public final void accept(final Visitor1 visitor) {
        visitor.visit(this);
        if (subsidiaries != null)
            subsidiaries.forEach(s -> s.accept(visitor));
    }

    public final void setParent(final Organization1 p) {
        ensureParentConstraint(p);
        if (p != null)
            p.ensureSubsidiaryTypeConstraint(this);
        if (parent != null)
            parent.subsidiaries.remove(this);
        parent = p;
        if (parent != null)
            parent.subsidiaries.add(this);
    }

    public Set<Organization1> getSubsidiaries() {
        return Collections.unmodifiableSet(subsidiaries);
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
