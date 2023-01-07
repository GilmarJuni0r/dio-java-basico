public class Quadrilateros{
    
    public static String calculaArea(double lado){ 
        return "Área do quadrado: " + lado*lado;
    }

    public static String calculaArea(double lado1, double lado2){
        return "Área do retângulo: " + lado1*lado2;
    }

    public static String calculaArea(double baseMaior, double baseMenor, double altura){
        return "Área do trapézio: " + ((baseMenor+baseMaior)*altura)/2;
    }

    public static String calculaArea(float diagonal1, float diagonal2){
        return "Área do losango: " + (diagonal1*diagonal2)/2;
    }
}