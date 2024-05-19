package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return  contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtulizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtulizado = c;
                break;
            }
        }
        return contatoAtulizado;
    }

    public static void main(String[] args) {
        AgendaContatos angendaContatos = new AgendaContatos();

        angendaContatos.exibirContatos();

        angendaContatos.adicionarContato("Camila", 123456);
        angendaContatos.adicionarContato("Camila", 5665);
        angendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        angendaContatos.adicionarContato("Camila DIO", 654987);
        angendaContatos.adicionarContato("Maria Silva", 1111111);

        angendaContatos.exibirContatos();
        System.out.println(angendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado: " + angendaContatos.atualizarNumeroContato("Maria Silva", 5555555));

        angendaContatos.exibirContatos();
    }
}
