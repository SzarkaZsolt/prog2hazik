/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szzs1
 */
public class Orarend {
    String nap;
    int szamlalo;
    Ora[] orarend;

    public Orarend(String nap) {
        this.nap = nap;
        this.szamlalo = 0;
        this.orarend=new Ora[12];
    }

    public String getNap() {
        return nap;
    }

    public int getSzamlalo() {
        return szamlalo;
    }

    public Ora[] getOrarend() {
        return orarend;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public void setSzamlalo(int szamlalo) {
        this.szamlalo = szamlalo;
    }

   /* public void setOrarend(Ora[] orarend) {
        Orarend.orarend = orarend;
    }*/

    @Override
    public String toString() {
        return "Orarend{" + "nap=" + nap + ", szamlalo=" + szamlalo + '}';
    }
    public  boolean oratHozzaad(Ora or)
    {
     if(szamlalo==orarend.length)
     {
         System.out.println("Az órarend megtelt!");
     }

        if(orarend[or.kezdete-8]==null)
        {
            orarend[or.kezdete-8]=or;
            szamlalo++;
            return true;
        }
        else 
        {
            System.out.println("Nem sikerült az új órát hozzáadni az órarendhez");
            return false;
        }      
     
    }
}
