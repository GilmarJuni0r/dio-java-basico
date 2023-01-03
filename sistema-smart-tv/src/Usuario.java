public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();

       System.out.println("--- Status inicial --- " + 
                        "\nTV ligada? " + smartTv.ligada +
                        "\nCanal atual: " + smartTv.canal +
                        "\nVolume atual: " + smartTv.volume);
       
       smartTv.ligar();
       System.out.println("TV ligada? " + smartTv.ligada);

       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.aumentarVolume();

       smartTv.aumentarCanal();
       smartTv.aumentarCanal();
       smartTv.aumentarCanal();
       smartTv.diminuirCanal();
       smartTv.mudarCanal(86);
       smartTv.diminuirCanal();
    }
}
