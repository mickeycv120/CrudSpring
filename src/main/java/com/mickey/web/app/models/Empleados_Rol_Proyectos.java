package com.mickey.web.app.models;

import java.math.BigInteger;

public class Empleados_Rol_Proyectos {
    private BigInteger Id_Proyecto;
    private BigInteger Id_Empleado_Rol;

    public Empleados_Rol_Proyectos() {
    }

    public BigInteger getId_Proyecto() {
        return Id_Proyecto;
    }

    public void setId_Proyecto(BigInteger id_Proyecto) {
        Id_Proyecto = id_Proyecto;
    }

    public BigInteger getId_Empleado_Rol() {
        return Id_Empleado_Rol;
    }

    public void setId_Empleado_Rol(BigInteger id_Empleado_Rol) {
        Id_Empleado_Rol = id_Empleado_Rol;
    }
}
