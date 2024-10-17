package player;

public class Ipod implements ReprodutorMusical {

    public String playlist = "Melhores momentos da Marilia";
    
    public void tocar() {
        buscarMusica();
        selecionarMusica();
        System.out.println("TOCANDO MUSICA");
    }

    public void selecionarMusica() {
        System.out.println("MUSICA 'EU SEI DE COR' SELECIONADA");
    }

    public void pausar() {
        System.out.println("MUSICA PAUSADA");
    }

    public void buscarMusica() {
        System.out.println("BUSCANDO MUSICA NO APPLE MUSIC...");
        System.out.println("MUSICA DA "+ playlist +" ENCONTRADA");
    }
    
}
