
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
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
public class NemzetiDohanybolt extends KereskedelmiEgyseg {
    String[] cigaretták;    

    public NemzetiDohanybolt(String[] cigaretták, String név, String cím, Date megnyitásDátuma) {
        super(név, cím, megnyitásDátuma);
        this.cigaretták = cigaretták;
    }
    

    @Override
    public String toString() {
        return "NemzetiDohanybolt{" + "cigaretták" + Arrays.toString(cigaretták) +" név: "+név+" cím: "+cím+" A megnyitás dátuma:"+megnyitásDátuma+  '}';
    }
    
}
