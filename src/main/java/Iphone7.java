public class Iphone7 implements AparelhoTelefonico, NavegadorNaIternet, ReprodutorMusical {


    @Override
    public void ligar() {
        System.out.println("Fazer Ligacao ");
    }

    @Override
    public void atender() {
        System.out.println("Atender uma Ligacao ");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar Correio de Voz");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir Pagina ");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar uma Nova Aba ");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar Pagina ");

    }

    @Override
    public void tocar() {
        System.out.println("Tocar Musica ");

    }

    @Override
    public void pausar() {
        System.out.println("Pausar Musica ");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar Musica");

    }
}
