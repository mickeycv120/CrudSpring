package com.mickey.web.app.models;

import java.math.BigInteger;

public class Equipos_Proyectos {

    private BigInteger Id_Equipos;
    private BigInteger ID_Equipo;
    private BigInteger ID_Proyecto;

    public Equipos_Proyectos() {
    }

    public BigInteger getId_Equipos() {
        return Id_Equipos;
    }

    public BigInteger getID_Equipo() {
        return ID_Equipo;
    }

    public void setID_Equipo(BigInteger ID_Equipo) {
        this.ID_Equipo = ID_Equipo;
    }

    public BigInteger getID_Proyecto() {
        return ID_Proyecto;
    }

    public void setID_Proyecto(BigInteger ID_Proyecto) {
        this.ID_Proyecto = ID_Proyecto;
    }
}
