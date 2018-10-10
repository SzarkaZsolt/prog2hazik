/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szzs1
 */
public class Ora {
    int kod;
    String név;
    int kezdete;

    public Ora(int kod, String név, int kezdete) {
        this.kod = kod;
        this.név = név;
        this.kezdete = kezdete;
        
        if((this.kezdete==20) || (this.kezdete==21) || (this.kezdete==22) || (this.kezdete==23) || (this.kezdete==0) || (this.kezdete==1))
        {
        this.kezdete = 19;
        }
        
        if((this.kezdete==2) || (this.kezdete==3) || (this.kezdete==4) || (this.kezdete==5) || (this.kezdete==6) || (this.kezdete==7))
        {
        this.kezdete = 8;
        }    
        
    }

    public int getKod() {
        return kod;
    }

    public String getNév() {
        return név;
    }

    public int getKezdete() {
        return kezdete;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setKezdete(int kezdete) {
        this.kezdete = kezdete;
    }

    @Override
    public String toString() {
        return "Ora{" + "kod=" + kod + ", n\u00e9v=" + név + ", kezdete=" + kezdete + '}';
    }
    
}
