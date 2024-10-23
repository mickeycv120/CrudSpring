package com.mickey.web.app.models;

import java.math.BigInteger;

public class Equipos {
    private BigInteger Id_Equipo;
    private BigInteger Id_Lider_Proyecto;
    private BigInteger Id_Miembro;

    public Equipos() {
    }

    public BigInteger getId_Equipo() {
        return Id_Equipo;
    }

    public BigInteger getId_Lider_Proyecto() {
        return Id_Lider_Proyecto;
    }

    public void setId_Lider_Proyecto(BigInteger id_Lider_Proyecto) {
        Id_Lider_Proyecto = id_Lider_Proyecto;
    }

    public BigInteger getId_Miembro() {
        return Id_Miembro;
    }

    public void setId_Miembro(BigInteger id_Miembro) {
        Id_Miembro = id_Miembro;
    }
}
