package com.mickey.web.app.models;

import java.math.BigInteger;

public class Empleados_Rol {
    private BigInteger ID_Empleado_rol;
    private BigInteger ID_Empleado;
    private BigInteger ID_Rol;

    public Empleados_Rol() {
    }

    public BigInteger getID_Empleado_rol() {
        return ID_Empleado_rol;
    }

    public BigInteger getID_Empleado() {
        return ID_Empleado;
    }

    public void setID_Empleado(BigInteger ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }

    public BigInteger getID_Rol() {
        return ID_Rol;
    }

    public void setID_Rol(BigInteger ID_Rol) {
        this.ID_Rol = ID_Rol;
    }
}
