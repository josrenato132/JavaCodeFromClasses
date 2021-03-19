
import java.util.Scanner;

public class teste {
    
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
       FilaInt minhaFila = new FilaInt(); //minhaFila = OBJETO
       
        System.out.println("INFORME O TAMANHO DA FILA A SER CRIADA:");
        
       
        minhaFila.gerarFila(ler.nextInt());
        
        
        minhaFila.retornaValor(0);
        
        System.out.println("VALOR");
       
       
               
       
    }
    
}
