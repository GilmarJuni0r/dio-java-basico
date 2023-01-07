public class Emprestimo {
    
    public static double calculaEmprestimoTotal(double valor, int parcelas){
        double total=0;
        
        if(parcelas == 1){
            total = valor;
        }else if(parcelas == 2){
            total = (valor*0.3)+valor;
        }else if(parcelas == 3){
            total = (valor*0.45)+valor;
        }else {
            total = (valor*0.65)+valor+(parcelas*1.5);
        }
        return total;
    }
    
}
