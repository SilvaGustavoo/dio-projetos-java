import celulares.Iphone;
import internet.Navegador;
import player.ReprodutorMusical;
import telefonia.Telefone;

public class Produtos {

    public static void main(String[] args) {
        
        Iphone iphone13 = new Iphone();

        Navegador navegador = iphone13;
        Telefone telefone = iphone13;
        ReprodutorMusical player = iphone13;
        System.out.println(" ");
        System.out.println("FUNÇÕES TELEFONE");

        iphone13.discar(11951212432L);
        iphone13.atender();
        iphone13.buscarContato("Rafael");
        iphone13.iniciarCorreioDeVoz();
        
        System.out.println(" ");
        System.out.println("FUNÇÕES REPRODUTOR MUSICAL");

        iphone13.buscarMusica();
        iphone13.selecionarMusica();
        iphone13.tocar();
        iphone13.pausar();

        System.out.println(" ");
        System.out.println("FUNÇÕES NAVEGADOR");

        iphone13.exibirPagina();
        iphone13.atualizarPagina();
        iphone13.adicionarNovaAba();

    }
}
