package internet;

public class Chrome implements Navegador{

    private String pagina = "INSTAGRAM";
    
    public void exibirPagina() {
        System.out.println("PAGINA " + pagina + " EXIBIDA COM SUCESSO");
    }

    public void adicionarNovaAba() {
        System.out.println("NOVA ABA ADICIONADA NO CHROME");
    }

    public void atualizarPagina() {
        System.out.println("PAGINA DO CHROME FOI ATUALIZADA");
    }
    
}
