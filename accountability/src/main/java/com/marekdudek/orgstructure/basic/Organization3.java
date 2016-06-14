package com.marekdudek.orgstructure.basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.util.Collections.unmodifiableSet;
import static java.util.stream.Collectors.toSet;

public class Organization3 {

    private String name;

    private Map<OrganizationStructureType3, OrganizationStructure3>      parents      = new HashMap<>();
    private Map<OrganizationStructureType3, Set<OrganizationStructure3>> subsidiaries = new HashMap<>();

    public Organization3(final Organization3 parent, final OrganizationStructureType3 type, final String name) {

        this.name = name;

        if (parent != null) {

            final OrganizationStructure3 structure = new OrganizationStructure3(parent, this, type);

            parents.put(type, structure);

            final Set<OrganizationStructure3> subs = parent.subsidiaries.get(type);
            if (subs == null)
                parent.subsidiaries.put(type, new HashSet<>());
            parent.subsidiaries.get(type).add(structure);
        }
    }

    public Organization3 getParent(final OrganizationStructureType3 type) {
        final OrganizationStructure3 struct = parents.get(type);
        return struct == null ? null : struct.getParent();
    }

    public Set<Organization3> getSubsidiaries(final OrganizationStructureType3 type) {
        final Set<OrganizationStructure3> structures = subsidiaries.getOrDefault(type, new HashSet<>());
        final Set<Organization3> subsidiaries = structures.stream().
                map(OrganizationStructure3::getSubsidiary).
                collect(toSet());
        return unmodifiableSet(subsidiaries);
    }
}
