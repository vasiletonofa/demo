package com.example.demo;

public class Magazin {

    private String denumire;
    private String adresa;
    private String proprietar;
    private String tip;

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getProprietar() {
        return proprietar;
    }

    public void setProprietar(String proprietar) {
        this.proprietar = proprietar;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    private Magazin(MagazinBuilder magazinBuilder) {
        this.proprietar = magazinBuilder.proprietar;
        this.tip = magazinBuilder.tip;
        this.adresa = magazinBuilder.adresa;
        this.denumire = magazinBuilder.denumire;
    }

    public static class MagazinBuilder {
        private String denumire;
        private String adresa;
        private String proprietar;
        private String tip;

        public MagazinBuilder denumire(String denumire) {
            this.denumire = denumire;
            return this;
        }

        public MagazinBuilder adresa(String adresa) {
            this.adresa = adresa;
            return this;
        }

        public MagazinBuilder proprietar(String proprietar) {
            this.proprietar = proprietar;
            return this;
        }

        public MagazinBuilder tip(String tip) {
            this.tip = tip;
            return this;
        }

        public Magazin build() {
            return new Magazin(this);
        }
    }
}
