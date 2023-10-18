package dispositivos;
import funcionalidades.AparelhoTelefônico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefônico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("música tocando...");
        ;
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
        ;
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web...");
    }

    @Override
    public void ligar() {
        System.out.println("Realizando ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Enviando correio de voz...");
    }

}
