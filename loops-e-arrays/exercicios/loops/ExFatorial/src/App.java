import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero = 5, fatorial=0;

        do{
            System.out.println("Digite um numero:");
            numero = scanner.nextInt();
           
            if(numero<=0)
                System.out.println("Número inválido, tente novamente");

        }while(numero<=0);

        fatorial = numero;
        
        for(int i=numero-1; i>0; i--){
            fatorial*=i;
        }
        
        System.out.println(numero+"! = "+fatorial);
    }
}
