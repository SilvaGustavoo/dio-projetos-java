package telefonia;

public class Intelbras implements Telefone{

    public void discar(long numero) {
        long telefone = numero;
        System.out.println("DISCANDO O NUMERO " + telefone);
    }

    public void atender() {
        boolean ligaram = true;
        if(ligaram) {
            System.out.println("A LIGAÇÃO FOI ATENDIDA COM SUCESSO");
        } else {
            System.out.println("NÃO EXISTE NENHUMA CHAMADA NO MOMENTO");
        }
        
    }

    public void iniciarCorreioDeVoz() {
        boolean atenderam = false;
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
