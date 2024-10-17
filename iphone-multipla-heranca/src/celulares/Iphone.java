package celulares;
import internet.Navegador;
import player.ReprodutorMusical;
import telefonia.Telefone;

public class Iphone implements Telefone, Navegador, ReprodutorMusical {
    
    private String contato = "Pedro";
    private boolean atenderam = false;
    private boolean ligaram = true;
    private long telefone = 11966587201L;
    public String playlist = "SAUDADES MALIRIA MENDONÇA";
    private String pagina = "HOBLOX";

    // INTERFACE DO REPRODUTOR DE MUSICA

    public void tocar() {
        System.out.println("TOCANDO MUSICA NO APPLE MUSIC");
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

    // INTERFACE DO NAVEGADOR DE INTERNET

    public void exibirPagina() {
        System.out.println("PAGINA " + pagina + " EXIBIDA COM SUCESSO");
    }

    public void adicionarNovaAba() {
        System.out.println("NOVA ABA ADICIONADA NO NAVEGADOR IPHONE");
    }

    public void atualizarPagina() {
        System.out.println("PAGINA DO NAVEGADOR IPHONE FOI ATUALIZADA");
    }

    // INTERFACE DO TELEFONE DE CHAMADAS E CORREIO DE VOZ

    public void discar(long telefone) {
        
        System.out.println("DISCANDO O NUMERO " + telefone);
    }

    public void atender() {
        
        if(ligaram) {
            System.out.println("A LIGAÇÃO FOI ATENDIDA COM SUCESSO");
        } else {
            System.out.println("NÃO EXISTE NENHUMA CHAMADA NO MOMENTO");
        }
        
    }

    public void iniciarCorreioDeVoz() {
        
        if(atenderam) {
            System.out.println("OIII COMO VOCÊ ESTÁ ?");
        } else {
            System.out.println("SUA MENSAGEM SERA GRAVADA APÓS O BIP");
        }
    }

    public void buscarContato(String contato) {
        
        System.out.println("BUSCANDO O CONTATO '"+ contato +"' NA SUA AGENDA");
    }

}
