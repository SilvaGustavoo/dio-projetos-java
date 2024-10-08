import java.util.Scanner;

import Exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = leitor.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = leitor.nextInt();

        try {
            contador(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }


    }

    public static void contador(int inicio, int fim) throws ParametrosInvalidosException {
        if(inicio > fim) {
            throw new ParametrosInvalidosException();
        }

        int contagem = fim - inicio;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }


}
