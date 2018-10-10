
import java.util.Date;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szzs1
 */
public class KereskedelmiEgyseg {
    String név;
String cím;
public Date megnyitásDátuma;

    public KereskedelmiEgyseg(String név, String cím,Date megnyitásDátuma) {
        this.név = név;
        this.cím = cím;
        this.megnyitásDátuma=megnyitásDátuma;
    }

    public String getNév() {
        return név;
    }

    public String getCím() {
        return cím;
    }

    public Date getMegnyitásDátuma() {
        return megnyitásDátuma;
    }

    public void setCím(String cím) {
        this.cím = cím;
    }

    @Override
    public String toString() {
        return "KereskedelmiEgyseg{" + "n\u00e9v=" + név + ", c\u00edm=" + cím + ", megnyit\u00e1sD\u00e1tuma=" + megnyitásDátuma + '}';
    }
    //a tostringben mik ezek a random karakterke? így generálja a tostring metódust..

    

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KereskedelmiEgyseg other = (KereskedelmiEgyseg) obj;
        if (!Objects.equals(this.név, other.név)) {
            return false;
        }
        if (!Objects.equals(this.cím, other.cím)) {
            return false;
        }
        if (!Objects.equals(this.megnyitásDátuma, other.megnyitásDátuma)) {
            return false;
        }
        return true;
    }
    
}
