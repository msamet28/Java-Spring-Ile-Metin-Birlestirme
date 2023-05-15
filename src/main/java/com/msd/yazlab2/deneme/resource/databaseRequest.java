package com.msd.yazlab2.deneme.resource;

public class databaseRequest {

    private String soncumle;

    private String[] cumleler;

    private String zaman;

    public databaseRequest() {
    }

    public databaseRequest(String soncumle, String[] cumleler, String zaman) {
        this.soncumle = soncumle;
        this.cumleler = cumleler;
        this.zaman = zaman;
    }

    public String getSoncumle() {
        return soncumle;
    }

    public void setSoncumle(String soncumle) {
        this.soncumle = soncumle;
    }

    public String[] getCumleler() {
        return cumleler;
    }

    public void setCumleler(String[] cumleler) {
        this.cumleler = cumleler;
    }

    public String getZaman() {
        return zaman;
    }

    public void setZaman(String zaman) {
        this.zaman = zaman;
    }

    

    

    
    
}
