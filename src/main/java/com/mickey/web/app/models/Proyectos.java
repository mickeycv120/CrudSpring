package com.mickey.web.app.models;

import java.math.BigInteger;
import java.sql.Date;

public class Proyectos {

    private BigInteger Id_Proyecto;
    private String ID_Interno;
    private String Nombre;
    private Date Fecha_Inicio;
    private Date Fecha_Fin;
    private BigInteger Equipo;
    private BigInteger Fase_Proyecto;

    public Proyectos() {
    }

    public BigInteger getId_Proyecto() {
        return Id_Proyecto;
    }

    public String getID_Interno() {
        return ID_Interno;
    }

    public void setID_Interno(String ID_Interno) {
        this.ID_Interno = ID_Interno;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Date getFecha_Inicio() {
        return Fecha_Inicio;
    }

    public void setFecha_Inicio(Date fecha_Inicio) {
        Fecha_Inicio = fecha_Inicio;
    }

    public Date getFecha_Fin() {
        return Fecha_Fin;
    }

    public void setFecha_Fin(Date fecha_Fin) {
        Fecha_Fin = fecha_Fin;
    }

    public BigInteger getEquipo() {
        return Equipo;
    }

    public void setEquipo(BigInteger equipo) {
        Equipo = equipo;
    }

    public BigInteger getFase_Proyecto() {
        return Fase_Proyecto;
    }

    public void setFase_Proyecto(BigInteger fase_Proyecto) {
        Fase_Proyecto = fase_Proyecto;
    }
}
