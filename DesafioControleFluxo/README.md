# DIO - Trilha Java Básico

## 📚 Cursos
<h1 style="font-size:18px">
    <a href="https://www.dio.me/">
     <img align="center" width="30px" src="https://hermes.digitalinnovation.one/assets/diome/logo-minimized.png"></a>
    <span> Santander 2024 - Backend com Java</span>
</h1>

### Autores
- [Gleyson Sampaio](https://github.com/glysns) Instrutor
- [Pedro Santiago](https://github.com/psantiago20) Aluno

## Controle de Fluxo - Desafio

Vamos exercitar todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:
- Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: <br>
```"Imprimindo o número 1"```, ```Imprimindo o número 2"``` e assim por diante.<br>

1. Crie o projeto ```DesafioControleFluxo```<br>
2. Dentro do projeto, crie a classe ```Contador.java``` para realizar toda a codificação do nosso programa.<br>
3. Dentro do projeto, crie a classe ```ParametrosInvalidosException``` que representará a exceção de negócio no sistema.

Abaixo temos um trecho de código no qual você poderá seguir alterando as partes que contenham ```??```
<br>
```public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.??;
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.??;
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (? exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	}
}
```