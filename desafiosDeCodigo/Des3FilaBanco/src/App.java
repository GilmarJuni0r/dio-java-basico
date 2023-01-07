import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] nomesFila = new String[3]; 
        Scanner nome = new Scanner(System.in); 
    
      for(int i=0; i<nomesFila.length; i++){
          nomesFila[i] = nome.next();
        }
        for(int i=0; i<nomesFila.length; i++){
          System.out.println(nomesFila[i] + " - esta na posicao: " + (i+1));
        }
    }
}
/*Desafio
Elabore um programa que simule uma fila de atendimento bancário. 
O programa deve ler o nome de 3 pessoas (clientes do banco), armazenando-os em uma fila.

Entrada
A entrada será o nome de três pessoas (clientes do banco).

Saída
O programa deve imprimir como saída na tela o nome da pessoa e sua posição na fila. */