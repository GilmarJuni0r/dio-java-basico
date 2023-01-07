public class Mensagem {
    
    public static String exibirMensagem(int hora){
        String mensagem="";
        
        switch(hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagem = "Bom dia!";
            break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                mensagem = "Boa tarde!";
            break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagem = "Boa noite!";
            break;
            default:
                mensagem = "Hora inválida";
            break;
        }
        return mensagem;
    }
}
