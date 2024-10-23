package com.mickey.web.app.models;

import java.math.BigInteger;
import java.sql.Date;

public class Fases_Proyectos {

    private BigInteger Id_Fase_Proyecto;
    private BigInteger Id_Empleado_Rol;
    private BigInteger Id_Fase;
    private double porcentaje;
    private Date fecha_Inicio;
    private Date fecha_Fin;
    private String Estatus;

    public Fases_Proyectos() {
    }

    public BigInteger getId_Fase_Proyecto() {
        return Id_Fase_Proyecto;
    }

    public BigInteger getId_Empleado_Rol() {
        return Id_Empleado_Rol;
    }

    public void setId_Empleado_Rol(BigInteger id_Empleado_Rol) {
        Id_Empleado_Rol = id_Empleado_Rol;
    }

    public BigInteger getId_Fase() {
        return Id_Fase;
    }

    public void setId_Fase(BigInteger id_Fase) {
        Id_Fase = id_Fase;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Date getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setFecha_Inicio(Date fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    public Date getFecha_Fin() {
        return fecha_Fin;
    }

    public void setFecha_Fin(Date fecha_Fin) {
        this.fecha_Fin = fecha_Fin;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String estatus) {
        Estatus = estatus;
    }
}
