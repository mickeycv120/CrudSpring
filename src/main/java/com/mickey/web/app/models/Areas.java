package com.mickey.web.app.models;

import java.math.BigInteger;

public class Areas {

    private BigInteger Id_Area;
    private String Area;

    public Areas() {
    }


    public void setId_Area(BigInteger id_Area) {
        Id_Area = id_Area;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }
}
