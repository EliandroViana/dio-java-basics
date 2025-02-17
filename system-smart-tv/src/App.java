public class App {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV Ligada: " + smartTv.ligada);
        smartTv.setCanal(101);
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.moreVolume();
        smartTv.moreVolume();
        smartTv.moreVolume();
        smartTv.lessVolume();

    }
}
