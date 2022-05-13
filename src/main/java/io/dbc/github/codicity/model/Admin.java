/**
 * User: Poorvi
 * Date: 26-02-2022
 * IDE: IntelliJ IDEA
 * File: io.dbc.github.codicity.model.Admin.java
 * JDK: Oracle JDK 17
 */

package io.dbc.github.codicity.model;

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
}
