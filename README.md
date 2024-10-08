# Projetos do Bootcamp DIO | Claro Java Spring Boot

## Resumo

Aqui serão adicionados todos os projetos realizados durante o Bootcamp, e vocês podem estar acompanhando a minha evolução durante todo o processo até aprender por completo o uso de Java com o framework Spring Boot. Lets go!!

### Estrutura das Pastas

The workspace contains two folders by default, where:

- `src`: pasta que contém os arquivos .java
- `lib`: as pastas com os pckages utilizados

> Os arquivos que são utilizads para compilação se encontram na pasta `bin` definida como pasta padrão.

## Projetos Desenvolvidos

### Projeto Java Básico: Conta Banco

O projeto tinha como objetivo desenvolver um programa em que le os seguintes dados:

* Numero da Conta
* Agência
* Nome do Cliente
* Saldo

E Mostrar na tela a mensagem informando todos os dados solicitados

> *"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque"*

Aqui foi utilizado a Biblioteca ***Scanner*** na leitura dos dados

``` java
    Scanner leitor = new Scanner(System.in);
```

### Projeto Java Básico: Desafio Controle de Fluxo

O projeto tinha como objetivo desenvolver um programa em que le os seguintes dados:

* parametroUm
* parametroDois
* Contagem

E assim realizar uma subtração entre o `parametroUm` e o `parametroDois`, após isso é mostrado na tela a interação resultante dessa subtração

> *"Imprimindo o número 1", "Imprimindo o número 2", ... "Imprimindo o número [Resultado da Subtração]"*

E nesse projeto também foi inserido uma `Exception` personalizada nomeada como `ParametrosInvalidosException` e utilizada um subtipo de exceção ***Checked*** para obrigar a utilização de um tratamento de exceção ao utilizar a função `Contador()`

``` java
    // Exception
    public class ParametrosInvalidosException extends Exception { ... }

    // Transformando variavel em Checked
    public static void contador(int parametroUm, int parametroDois) throws ParametrosInvalidosException { ... }
```

Aqui foi utilizado a Biblioteca ***Scanner*** na leitura dos dados

``` java
    Scanner leitor = new Scanner(System.in);
```

### Projeto Java Básico: Controle de Candidatos

O projeto tinha como objetivo desenvolver um programa em que le os seguintes dados:

* Nome Candidato
* Salário Pretendido
* Slário Base
* Total de Candidatos
* Total de Candidatos à serem Aprovados

e retorna as seguintes informações

* Nome dos Melhores Candidatos
* Salario Pretendido dos Melhores Candidatos
* Candidato atendeu a ligação
* Total de Tentativas de Contato

Com base nos dados acima o sistema solicita a quantidade de candidatos a vaga pelo `totalCandidatos` e o limite de candidatos que podem passar para a fase seguinte no `totalCandidatosAprovados`.

Após isso é solicitado o nome do candidato e o salário pretendido até dar o total de candidatos a vaga. Com isso, é selecionado os melhores candidatos pelo `melhoresCandidatos` e os salarios desses candidatos no `salariosCandidato`, utilizado como metodo aquele que oferecesse o menor *salário pretendido*, para assim entrarem em contato de acordo com alguns critérios.

Por fim são realizadas as tentativas de contato caso o salário pretendido não ultrapasse o salário base (nesse caso foi R$ 2000,00 reais) contido na `salarioBase`. As tentativas são limitadas em 3 e foi utilizado um metodo `Random()` para que a ligação ocorresse ou não de maneira aleatória. Por fim mostra se o candidato atendeu a ligação, seu nome e o total de tentativas utilizadas para ele atender na variavel `tentativasRealizadas`

> *Nome: [Nome do Candidato Aprovado]* <br> *Salario: [Salario Pretendido do Candidato Aprovado]* <br> <br> *[Demonstra se vai ou não ligar para o candidato]* <br>
*"Conseguimos entrar em contato com o candidato [Candidato] na  [Tentativas Realizadas]  tentativa."*

E nesse projeto também foi inserido uma `Exception` personalizada nomeada como `QuantidadeDeCandidatosException` e utilizada um subtipo de exceção ***Checked*** para obrigar a utilização de um tratamento de exceção ao utilizar a função `selecaoCandidatos()`

``` java
    // Exception
    public class QuantidadeDeCandidatosException extends Exception { ... }

    // Transformando variavel em Checked
    static void analisarCandidato(String nome, double salarioPretendido) throws QuantidadeDeCandidatosException { ... }
```

Aqui foi utilizado as Bibliotecas ***Scanner*** na leitura dos dados, a ***ArrayList*** para manipulação de arrays e a ***Random*** para geração de resultados aleatórios.

``` java
    // Leitor de dados
    Scanner leitor = new Scanner(System.in);

    // ArrayList permitiu alterar, adicionar e manipular arrays com mais facilidade
    ArrayList<String> melhoresCandidatos = new ArrayList();

    // Usado no metodo atender para caso 1 retorne que o candidato atendeu
    new Random().nextInt(5)
```
