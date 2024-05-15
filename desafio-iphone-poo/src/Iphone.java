import com.navegador.NavegadorInternet;
import com.reprodutor.ReprodutorMusical;
import com.telefone.AparelhoTelefonico;

public class Iphone {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical rp = new ReprodutorMusical();
        NavegadorInternet ni = new NavegadorInternet();
        AparelhoTelefonico at = new AparelhoTelefonico();




        
        String funcionalidadeEscolhida = "at";

        if(funcionalidadeEscolhida.equals("at")){
            at.ligar();
            at.atender();
            at.iniciarCorreioVoz();
        }
        else if(funcionalidadeEscolhida.equals("ni")){
            ni.exibirPagina();
            ni.adicionarNovaAba();
            ni.atualizarPagina();
        }
        else if(funcionalidadeEscolhida.equals("rp")){
            rp.selecionarMusica();
            rp.tocar();
            rp.pausar();
        }
    }
}
