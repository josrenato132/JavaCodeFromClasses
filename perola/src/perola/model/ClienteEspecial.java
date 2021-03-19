
package perola.model;

public class ClienteEspecial extends Cliente{

   
    public double aumentaLimite() {
        
        setLimite(getLimite()+200);
        
        return getLimite();
        
    }    
}
