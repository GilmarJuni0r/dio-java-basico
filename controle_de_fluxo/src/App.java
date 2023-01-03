import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int mes,valor;
        String dia;
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Digite o numero do mês: ");
        mes = scanner.nextInt();
        System.out.println("Digite o dia da semana: ");
        dia = scanner.next();
        System.out.println("Digite um valor qualquer: ");
        valor = scanner.nextInt();

        if(mes == 1){
            System.out.println("Janeiro");
        }else if(mes == 2){
            System.out.println("Fevereiro");
        }else if(mes == 3){
            System.out.println("Março");
        }else if(mes == 4){
            System.out.println("Abril");
        }else if(mes == 5){
            System.out.println("Maio");
        }else if(mes == 6){
            System.out.println("Junho");
        }else if(mes == 7){
            System.out.println("Julho");
        }else if(mes == 8){
            System.out.println("Agosto");
        }else if(mes == 9){
            System.out.println("Setembro");
        }else if(mes == 10){
            System.out.println("Outubro");
        }else if(mes == 11){
            System.out.println("Novembro");
        }else if(mes == 12){
            System.out.println("Dezembro");
        }else{
            System.out.println("Mês inválido");
        }

        if(mes == 7 || mes == 12 || mes == 1){
            System.out.println("Você está de férias XD");
        }

        switch(dia){
            case "domingo":
                System.out.println("1");
            break;
            case "segunda":
                System.out.println("2");
            break;
            case "terça":
                System.out.println("3");
            break;
            case "quarta":
                System.out.println("4");
            break;
            case "quinta":
                System.out.println("5");
            break;
            case "sexta":
                System.out.println("6");
            break;
            case "sábado":
                System.out.println("7");
            break;
            default:
                System.out.println("Dia inválido");
            break;
            
        }
        switch(valor){
            case 1:
            case 2:
            case 3:
                System.out.println("certo");
            break;
            case 4:
                System.out.println("Errado");
            break;
            case 5:
                System.out.println("Talvez");
            break;
            default:   
                System.out.println("Valor indefinido");
            break;

        }
    }
}
