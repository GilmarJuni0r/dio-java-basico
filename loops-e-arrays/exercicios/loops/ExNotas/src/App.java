import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Nota: Faça um programa que peça uma nota, entre zero e dez.
        Mostre uma mensagem caso o valor seja inválido e continue
        pedindo até que o usuário informe um valor válido.*/
        
        int nota=0;
        boolean notaValida = false;
        Scanner scanner = new Scanner(System.in);

        while(!notaValida){
            System.out.println("Digite uma nota válida (entre 0 e 10):");
            nota = scanner.nextInt();

            if(!(nota >= 0 && nota <= 10))
                System.out.println("Nota inválida, tente novamente");
            else
                notaValida = true;
        }

        System.out.println("Nota digitada = "+nota);
    }
}
