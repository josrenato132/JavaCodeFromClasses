
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Larissa Souza
 */

public class Exercicios {
    /*Escreva um programa para cirar duas filas A e B e criar uma terceira fila C.
Onde devem estar em primeiro lugar, os elementos da Fila A e em seguida os elementos da Fila B.
(em ambos os casos deve ser mantida a ordem original).
Ex: Fila a: 1,2,3,4,5.
Fila b: 3,4,5,6,7.
Fila c:1,2,3,4,5,3,4,5,6,7.
 */

public class Exercicio2 {

	public void main(String[] args) {
            FilaInt a = new FilaInt ();
            FilaInt b = new FilaInt();
            FilaInt c = new FilaInt();
        int aux;//aux de auxiliar, variável auxiliar em geral;
        int t; //T de tamanho, para assim o susário informar o tamanho da Fila;
        Scanner ler = new Scanner(System.in);
        
        //usando o metodo de gerar fila A;
        System.out.println("Informe o tamanho da fila: ");
        t = ler.nextInt();
        a.gerarFila(t);
        
        //usando o metodo de gerar fila B;
        System.out.println("Informe o tamanho da fila: ");
        t = ler.nextInt();
        b.gerarFila(t);
        
        c.retornaValor(a,b,c);
        c.retornaValor();
	}

}

}