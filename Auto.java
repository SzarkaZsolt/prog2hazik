
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
public class Auto {
    String rendszám;    
    int motorTeljesítmény;
    Date gyártásDátuma;

    /**
     *
     * @param rendszám
     * @param motorTeljesítmény
     */
    public Auto(String rendszám, int motorTeljesítmény) {
        this.rendszám = rendszám;
        this.motorTeljesítmény = motorTeljesítmény;
        this.gyártásDátuma = new Date();
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getMotorTeljesítmény() {
        return motorTeljesítmény;
    }

    public Date getGyártásDátuma() {
        return gyártásDátuma;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    @Override
    public String toString() {
        return "Aut\u00f3{" + "rendsz\u00e1m=" + rendszám + ", motorTeljes\u00edtm\u00e9ny=" + motorTeljesítmény + ", gy\u00e1rt\u00e1sD\u00e1tuma=" + gyártásDátuma + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Auto other = (Auto) obj;
        if (!Objects.equals(this.rendszám, other.rendszám)) {
            return false;
        }
        if (this.motorTeljesítmény != other.motorTeljesítmény) {
            return false;
        }
        if (!Objects.equals(this.gyártásDátuma, other.gyártásDátuma)) {
            return false;
        }
        return true;
    }
    
}
