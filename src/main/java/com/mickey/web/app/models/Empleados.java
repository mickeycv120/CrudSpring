package com.mickey.web.app.models;

import java.math.BigInteger;

public class Empleados {

    private BigInteger Id_Empleado;
    private String Nombre;
    private String Appellido_Paterno;
    private String Apellido_Materno;
    private int Numero_Empleado;

    public Empleados() {
    }

    public BigInteger getId_Empleado() {
        return Id_Empleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getAppellido_Paterno() {
        return Appellido_Paterno;
    }

    public void setAppellido_Paterno(String appellido_Paterno) {
        Appellido_Paterno = appellido_Paterno;
    }

    public String getApellido_Materno() {
        return Apellido_Materno;
    }

    public void setApellido_Materno(String apellido_Materno) {
        Apellido_Materno = apellido_Materno;
    }

    public int getNumero_Empleado() {
        return Numero_Empleado;
    }

    public void setNumero_Empleado(int numero_Empleado) {
        Numero_Empleado = numero_Empleado;
    }
}
