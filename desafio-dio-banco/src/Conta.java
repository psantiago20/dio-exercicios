public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    private static int LIMITE = 100;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double limite;
    private Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.limite = LIMITE;
    } 
    
    @Override
    public void sacar(double valor){
        if((saldo + limite) >= valor && valor > 0){
        saldo -= valor;
        } else{
            throw new IllegalArgumentException("Limite insuficiente ou valor do saque menor ou igual a 0");
        }
    }

    @Override
    public void depositar(double valor){
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino){
        if((saldo + limite) >= valor && valor > 0){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }else{
            throw new IllegalArgumentException("Limite insuficiente ou valor de transferência menor ou igual a 0");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    protected void ImprimirInfosComuns(){
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Número: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }
    
}
