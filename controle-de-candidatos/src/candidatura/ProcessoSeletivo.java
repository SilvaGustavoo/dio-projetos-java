package candidatura;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import error.QuantidadeDeCandidatosException;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o total de candidatos que serão avaliados: ");
        int totalCandidatos = leitor.nextInt();
        System.out.print("Digite o numero de candatos que passarão para a proxima fase: ");
        int totalCandidatosAprovados = leitor.nextInt();

        try {
            selecaoCandidatos(totalCandidatos, totalCandidatosAprovados);
        } catch (QuantidadeDeCandidatosException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /**
     * @param totalCandidatos Total de candidatos que vão participar do proceso seletivo
     * @param totalCandidatosAprovados Total de candidatos que o usuarios deseja que passe para a próxima fase do processo seletivo
     * @throws QuantidadeDeCandidatosException Quando o numero de candidatos desejados a passar é maior que a quantidade total de usuarios, causando assim esse erro
     * 
     * @return Carrega a função analisarCandidato() e retorna a lista dos candidatos que ofereceram um menor salario pretendido
     */
    static void selecaoCandidatos(int totalCandidatos, int totalCandidatosAprovados) throws QuantidadeDeCandidatosException {

        Scanner leitor = new Scanner(System.in);
        ArrayList<String> melhoresCandidatos = new ArrayList();
        ArrayList<Double> salariosCandidato = new ArrayList();

        try {

            for (int i = 0; i < totalCandidatos; i++) {
                System.out.print("Digite seu nome: ");
                String nome = leitor.next();
                System.out.print("Digite o salario pretendido: ");
                Double salarioPretendido = Double.parseDouble(leitor.next());

                System.out.println(" "); // Pular linha

                if(melhoresCandidatos.size() < totalCandidatosAprovados) {
                    melhoresCandidatos.add(nome);
                    salariosCandidato.add(salarioPretendido);
                } else {
                    for (int x = 0; x < salariosCandidato.size(); x++) {
                        if(salarioPretendido < salariosCandidato.get(x)) {
                            salariosCandidato.set(x, salarioPretendido);
                            melhoresCandidatos.set(x, nome);
                        }
                    }
                }
            }

            System.out.println("CANDIDATOS SELECIONADOS");
            System.out.println(" ");

            for (int i = 0; i < salariosCandidato.size(); i++) {
                
                System.out.println("Nome: " + melhoresCandidatos.get(i));
                System.out.println("Salario: " + salariosCandidato.get(i));

                analisarCandidato(melhoresCandidatos.get(i), salariosCandidato.get(i));
            }

        } catch (Exception e) {
            System.out.println("Digite apenas valores numéricos");
        }
    }


    /**
     * @param nome Nome do candidato
     * @param salarioPretendido Salario pretendido do candidato
     * 
     * @return retorna a atitude ideal de acordo com o salario pretendido
     */ 
    static void analisarCandidato(String nome, double salarioPretendido) {
        final double salarioBase = 2000;

        if(salarioBase > salarioPretendido) {
            System.out.println("Liguar para o candidato");
            entrandoEmContato(nome);
            
        } else if( salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contraproposta");
            entrandoEmContato(nome);
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }

        System.out.println(" "); // pular linha
    }

    static boolean atender() {
        return new Random().nextInt(5) == 1;
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando) {
                
            } else if(!continuarTentando) {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

            tentativasRealizadas++;

        }while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos entrar em contato com o candidato " + candidato + " na " + tentativasRealizadas + " tentativa.");
        } else {
            System.out.println("Não foi possivel entra em contato com o candidato " + candidato + " foram realizadas " + tentativasRealizadas + " tentativas.");
        }
    }
}
