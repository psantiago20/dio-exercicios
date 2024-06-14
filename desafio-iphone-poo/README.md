# DIO - Trilha Java Básico

www.dio.me


### Autores

* [Gleyson Sampaio](https://github.com/glysns) - Instrutor responsável
* [Pedro Santiago](https://github.com/psantiago20) - Aluno

## POO - Desafio
Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.

Com base no vídeo de lançamento do iPhone conforme link abaixo, elabore em uma ferramenta de UML de sua preferência a diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musicial, Aparelho Telefônico e Navegador na Internet. Em seguida crie as classes e interfaces no formato de arquivos .java

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
* Minutos relevantes do 00:15 até 00:55

<font color="gray">Comportamentos esperados:</font> <br>
* Reprodutor Musical: tocar, pausar, selecionarMusica
* Aparelho Telefônico: ligar, atender, inciarCorreioVoz
* Navegador na Internet: exibirPagina, adiconarNovaAba, atualizarPagina

## Diagrama de Classes

```mermaid
classDiagram
    class Iphone {
        +ReprodutorMusical
        +AparelhoTelefonico
        +NevagadorInternet
    }

    class ReprodutorMusical {
        -void tocar
        -void pausar
        -void selecionarMusica
    }

    class AparelhoTelefonico {
        -void ligar
        -void atender
        -void iniciarCorreioVoz
    }

    class NavegadorInternet {
        -void exibirPagina
        -void adicionarNovaAba
        -void atualizarPagina
    }
    Iphone -- ReprodutorMusical
    Iphone -- AparelhoTelefonico
    Iphone -- NavegadorInternet
```