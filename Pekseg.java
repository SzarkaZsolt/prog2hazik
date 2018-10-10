
import java.util.Arrays;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szzs1
 */
public class Pekseg extends KereskedelmiEgyseg{
    public String[] pékÁruk;


  public Pekseg(String[] pékÁruk, String név, String cím, Date megnyitásDátuma) {
        super(név, cím, megnyitásDátuma);
        this.pékÁruk = pékÁruk;
    }


    @Override
    public String toString() {
        return "Pekseg{" + "pékáruk=" + Arrays.toString(pékÁruk)+" név: "+név+" cím: "+cím+" Megnyitás dátuma: "+ megnyitásDátuma+ '}';
    }
    
}
