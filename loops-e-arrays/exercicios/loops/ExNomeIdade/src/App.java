import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Nome e Idade: Faça um programa que leia conjuntos de dois valores,
        o primeiro representando o nome do aluno e o segundo representando a sua idade.
        (Pare o programa inserindo o valor 0 no campo nome)*/
        String nome = "";
        int idade = 0;

        Scanner scanner = new Scanner(System.in);

        while(!(nome.equals("0"))){
            System.out.println("Digite o nome:");
            nome = scanner.next();
            System.out.println("Digite a idade:");
            idade = scanner.nextInt();
        }
    }
}
