package com.antonin.springSecurity.security.config;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.antonin.springSecurity.security.config.UserPermission.*;

public enum UserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(
          STUDENT_WRITE,
            STUDENT_READ,
            COURSE_READ,
            COURSE_WRITE
    ));

    private final Set<UserPermission> permissionSet;

    UserRole(Set<UserPermission> permissionSet) {
        this.permissionSet = permissionSet;
    }

    public Set<UserPermission> getPermissionSet() {
        return permissionSet;
    }
}
