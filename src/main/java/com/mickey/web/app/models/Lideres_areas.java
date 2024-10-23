package com.mickey.web.app.models;

import java.math.BigInteger;

public class Lideres_areas {

    private BigInteger ID_Lider_area;
    private BigInteger ID_Empleado;
    private BigInteger ID_Area;

    public Lideres_areas() {
    }

    public BigInteger getID_Lider_area() {
        return ID_Lider_area;
    }

    public BigInteger getID_Empleado() {
        return ID_Empleado;
    }

    public void setID_Empleado(BigInteger ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }

    public BigInteger getID_Area() {
        return ID_Area;
    }

    public void setID_Area(BigInteger ID_Area) {
        this.ID_Area = ID_Area;
    }
}
