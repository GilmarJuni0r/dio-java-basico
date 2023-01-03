public class SmartTv{

    boolean ligada = false;
    int canal = 1;
    int volume = 25; 

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: "+volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: "+volume);
    }

    public void mudarCanal(int canal){
        this.canal = canal;
        System.out.println("Canal alterado para: "+this.canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal alterado para: "+canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Canal alterado para: "+canal);
    }

}