import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        do{
            System.out.println("Digite um numero:");
            numero = scanner.nextInt();            
        }while(numero<=0);
        
        System.out.println("--- Tabuada de "+numero+" ---");
        for(int i=1; i<=10; i++){           
                System.out.println(numero+" X "+i+" = "+ numero*i);
           
        }
    }
}
