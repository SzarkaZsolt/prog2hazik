/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi1;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author szzs1
 */
public class Ital {

    protected String nev;
    protected String kiszereles;
    private static int ar = 10;
    protected Date gyartasiDatum;
    
    

    public Ital(String nev, String kiszereles, Date gyartasiDatum) {
        this.nev = nev;
        this.kiszereles = kiszereles;
        this.gyartasiDatum = gyartasiDatum;
        }
    
    

    public String getNev() {
        return nev;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public int getAr() {
        return ar;
    }

    public Date getGyartasiDatum() {
        return gyartasiDatum;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKiszereles(String kiszereles) {
        this.kiszereles = kiszereles;
    }

    public static void setAr(int ar) {
        Ital.ar = ar;
    }

    public void setGyartasiDatum(Date gyartasiDatum) {
        this.gyartasiDatum = gyartasiDatum;
    }

    @Override
    public String toString() {
        return "Nev "+getNev()+"Kiszereles "+getKiszereles()+"Ar "+getAr()+"Ft";
    }

    @Override
    public boolean equals(Object asd) {
       if(asd == null || !(asd instanceof Ital)){
           return false;
       }
       
       Ital masik = (Ital) asd;
       
       return this.getNev() == masik.getNev() && this.getKiszereles() == masik.getKiszereles() && this.getAr() == masik.getAr();
      

    }   
    
    
    
    
}
