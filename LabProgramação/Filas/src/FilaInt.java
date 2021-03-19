
import java.util.Scanner;


public class FilaInt {
    
    int[] vetor = new int[5];    //VETOR ESTATICO
    int valor;
    int tamanhoFila = 0;       //CONTADOR    
    
    public int getTamanho()
    {
        return tamanhoFila;
    }
    public void inserir(int valor)
    {
        vetor[tamanhoFila] = valor;
        tamanhoFila++;
    }

    public int remover()
    {
       int valor;
       valor = vetor[0];
       for (int i = 0; i < tamanhoFila; i++)
       {
        vetor[i] = vetor[i + 1];   
       }
       vetor[tamanhoFila] = 0;
       tamanhoFila--;
        System.out.println("VALOR REMOVIDO" +valor);
        return valor;
    }

    public int retornaValor(int posicao)
    {
     return vetor[posicao];
    }    
    public boolean vazia()
    {
        if (tamanhoFila == 0)
        {
            return true;
        }
    else
        {
            return false;
        }
    
    }
    
    public void gerarFila(int tamanho)
    {
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < tamanho; i++)
        {
            System.out.println("INFORME O VALOR");
            vetor[i] = ler.nextInt();
            tamanhoFila++;
        }
    }
    

}











