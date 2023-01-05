import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero=0, maior=0, soma=0, i=0;
        
        do{
            System.out.println("Digite um número");
            numero = scanner.nextInt();
            soma += numero;

            if(numero>maior)
                maior = numero;
            
            i++;
        }while(i<5);

        System.out.println("O maior número digitado foi: "+maior);
        System.out.println("A média entre os números digitados é: "+(soma)/5);
    } 
}
