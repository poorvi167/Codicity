/**
 * User: Poorvi
 * Date: 26-02-2022
 * IDE: IntelliJ IDEA
 * File: io.dbc.github.codicity.model.Admin.java
 * JDK: Oracle JDK 17
 */

package io.dbc.github.codicity.model;

import java.util.Objects;

public class Admin {
    private String adminName;
    private String adminPassword;
    private String adminLocation;

    public Admin(String adminName, String adminPassword, String adminLocation) {
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.adminLocation = adminLocation;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminLocation() {
        return adminLocation;
    }

    public void setAdminLocation(String adminLocation) {
        this.adminLocation = adminLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(adminName, admin.adminName) && Objects.equals(adminPassword, admin.adminPassword) && Objects.equals(adminLocation, admin.adminLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminName, adminPassword, adminLocation);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminName='" + adminName + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminLocation='" + adminLocation + '\'' +
                '}';
    }
}
