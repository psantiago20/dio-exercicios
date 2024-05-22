import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Cliente novoCliente = new Cliente();
        
        System.out.println("Por favor, digite o seu nome: ");
        novoCliente.setNome(scanner.next());

        Conta cc = new ContaCorrente(novoCliente);     
        
        cc.depositar(100);       
        cc.sacar(150);

        Conta poupanca = new ContaPoupanca(novoCliente);

        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    
        scanner.close();   
    }
}
