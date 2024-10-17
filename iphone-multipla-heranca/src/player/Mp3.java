package player;

public class Mp3 implements ReprodutorMusical  {

    public String playlist = "MARILIA MENDONÇA MAIS OUVIDAS";

    public void tocar() {
        buscarMusica();
        selecionarMusica();
        System.out.println("TOCANDO MUSICA");
    }


    public void selecionarMusica() {
        System.out.println("MUSICA 'ALÔ PORTEIRO' SELECIONADA");
    }


    public void pausar() {
        System.out.println("MUSICA PAUSADA");
    }

    
    public void buscarMusica() {
        System.out.println("BUSCANDO MUSICA NO APPLE MUSIC...");
        System.out.println("MUSICA DA "+ playlist +" ENCONTRADA");
    }
    
}
