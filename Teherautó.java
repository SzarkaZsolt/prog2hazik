/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szzs1
 */
public class Teherautó extends Auto {
    public int maxSzallíthatóTeher;

    public Teherautó(int maxSzallíthatóTeher, String rendszám, int motorTeljesítmény) {
        super(rendszám, motorTeljesítmény);
        this.maxSzallíthatóTeher = maxSzallíthatóTeher;
    }

    public int getMaxSzallíthatóTeher() {
        return maxSzallíthatóTeher;
    }

    @Override
    public String toString() {
        return "Teheraut\u00f3{" + "maxSzall\u00edthat\u00f3Teher=" + maxSzallíthatóTeher + " rendszám:"+ rendszám +" Motorteljesítmény:"+ motorTeljesítmény+'}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Teherautó other = (Teherautó) obj;
        if (this.maxSzallíthatóTeher != other.maxSzallíthatóTeher) {
            return false;
        }
        return true;
    }
    
}
