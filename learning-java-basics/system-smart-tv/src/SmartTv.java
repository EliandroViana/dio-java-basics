public class SmartTv {

    public boolean ligada = false;
    public int canal = 1;
    public int volume = 10;

    public void ligar() {
        this.ligada = true;
    }
    public void desligar() {
        this.ligada = false;
    }

    public int setCanal(int canalDesired) {
        if (canalDesired >= 1 && canalDesired <= 99) {
            this.canal = canalDesired;
        } else {
            System.out.println("Canal inválido");
        }
        return this.canal;
    }

    public void moreVolume() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void lessVolume() {
        volume--;
        System.out.println("Volume: " + volume);
    }

}
