package com.msd.yazlab2.deneme.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("proje")
public class database {

    @Id
    private String id;

    private String soncumle;

    private String[] cumleler;

    private String zaman;


    public database(){

    }

    public database(String soncumle, String[] cumleler, String zaman) {
        this.soncumle = soncumle;
        this.cumleler = cumleler;
        this.zaman = zaman;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
