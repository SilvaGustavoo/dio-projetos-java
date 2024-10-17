package internet;

public class Explorer implements Navegador {

    private String pagina = "FACEBOOK";
    
    public void exibirPagina() {
        System.out.println("PAGINA " + pagina + " EXIBIDA COM SUCESSO");
    }

    public void adicionarNovaAba() {
        System.out.println("NOVA ABA ADICIONADA NO EXPLORER");
    }

    public void atualizarPagina() {
        System.out.println("PAGINA DO EXPLORER FOI ATUALIZADA");
    }
}
