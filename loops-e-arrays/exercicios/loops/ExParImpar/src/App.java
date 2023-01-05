import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=0,pares=0,impares=0;
                
        do{
            System.out.println("Quantos número serão digitados?");
            n = scanner.nextInt();

            if(n>0)
                break;
            else
                System.out.println("Valor inválido");

        }while(true);
        
        int i=0,aux=0;
        do{
            System.out.println("Digite um número:");
            aux=scanner.nextInt();

            if(aux%2 == 0)
                pares++;
            else
                impares++;

                i++;
        }while(i<n);

        System.out.println("Foram digitados "+pares+" números pares."
                        +"\nForam digitados "+impares+" números impares.");
    }
}
