
package perola.interfaces;

import perola.model.Cliente;

public interface IClienteDAO {
    
    public void salvar(Cliente pCliente);
    //colocar retorno boolean
    
    public boolean remover(Cliente pCliente);
    
}
