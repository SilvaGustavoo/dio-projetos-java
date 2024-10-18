### Projeto Java Básico: Criação UML para IPhone usando Interfaces no Java

O projeto tinha como objetivo desenvolver um programa e um modelo UML do primeiro Iphone da Apple, no qual se uniam as funcionalidades de Telefone, Reprodutor musical e Navegador de internet. Com isso foram criadas e separadas as seguintes classes e pacotes:


* ***Package: Celular***
    * Iphone
* ***Package: Internet***
    * Chrome
    * Explorer
    * *Navegador* - interface
* ***Package: Player***
    * Ipod
    * MP3
    * *ReprodutorMusical* - interface
* ***Package: Telefonia***
    * IntelBras
    * *Telefone* - interface

* **Produtos** - Main

<br>

> ***Obs:*** na pasta [docs]() é possivel visualizar o projeto em UML para uma melhor analise do código.


Nesse projeto foram desenvolvidas três interfaces onde serveriam como padronição de classes correspondentes aos seus tipos, sendo as interfaces: 

 - **`Telefone`** o qual remete a dispositivos que realizam apenas chamadas. 

- **`ReprodutorMusical`**, fazendo referencia a aparelhos reprodutores de musicas, como MP3, Ipod, entre outros.
- **`Navegador`**, Seriam os aplicativos de navegação pela internet, onde na epoca era exclusivo apenas a computadores.

``` java
// Iniciando uma interface
public interface Telefone {...}

// Implementando aos seus correspondentes
public class Intelbras implements Telefone {...}
```

Com base nisso, foi criados metodos coerentes com as funcionalidades das interfaces, obrigando os objetos a implemntar o metodo em seu escopo. Como pode ser visualizado nas classes `Chrome` e  `Explorer`, o metodo obrigatorio ***exibirPagina()***

``` java
@Override
public void exibirPagina() {
    System.out.println("PAGINA " + pagina + " EXIBIDA COM SUCESSO");
}
```

Por fim, foi implementado as très interfaces na classe `Iphone`, transformando e reconhecido como um Telefone, Reprodutor Musical e um Navegador. Podendo ser igualado a qualquer uma dessas Classes sem ocorrer erros.

``` java
Iphone iphone13 = new Iphone();

Navegador navegador = iphone13;
Telefone telefone = iphone13;
ReprodutorMusical player = iphone13;
```

> ***Obs:*** Interfaces apenas serve para organizar o código e fazer com que metodos inscritos sejam obrigatorios a implementação. 
