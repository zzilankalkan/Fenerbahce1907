package com.example.fenerbahceapp.models;

public class Basari {
    private String sayi;
    private String baslik;
    private int resimId;

    public Basari(String sayi, String baslik, int resimId) {
        this.sayi = sayi;
        this.baslik = baslik;
        this.resimId = resimId;
    }

    public String getSayi() { return sayi; }
    public String getBaslik() { return baslik; }
    public int getResimId() { return resimId; }
}
