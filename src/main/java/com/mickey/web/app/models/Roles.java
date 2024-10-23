package com.mickey.web.app.models;

import java.math.BigInteger;

public class Roles {

    private BigInteger ID_Rol;
    private String rol;

    public Roles() {
    }

    public BigInteger getID_Rol() {
        return ID_Rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
