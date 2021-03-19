
package perola.model;

public class Cliente {
   
    private int cod;
    private String nome;
    private double limite;

    
  
    public int getCod() {
        return cod;
    }


    public void setCod(int cod) {
        this.cod = cod;
    }

  
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
       public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
    public double aumentaLimite(){
        
        setLimite(getLimite()+100.0);
        
        return limite;
        
        //colocar retorno
        
        
    } 
    
}
