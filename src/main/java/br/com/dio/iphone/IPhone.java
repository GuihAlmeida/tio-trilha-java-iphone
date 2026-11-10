package br.com.dio.iphone;

/** iPhone que reúne os papéis de música, telefone e navegação na internet. */
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String musicaAtual;
    private String paginaAtual;

    @Override
    public void tocar() {
        if (musicaAtual == null) {
            System.out.println("Nenhuma música selecionada.");
            return;
        }
        System.out.println("Tocando: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Reprodução pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        if (musica == null || musica.isBlank()) {
            throw new IllegalArgumentException("O nome da música não pode estar vazio.");
        }
        musicaAtual = musica;
        System.out.println("Música selecionada: " + musicaAtual);
    }

    @Override
    public void ligar(String numero) {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("O número não pode estar vazio.");
        }
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        if (url == null || url.isBlank()) {
            throw new IllegalArgumentException("A URL não pode estar vazia.");
        }
        paginaAtual = url;
        System.out.println("Exibindo página: " + paginaAtual);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void atualizarPagina() {
        if (paginaAtual == null) {
            System.out.println("Nenhuma página aberta para atualizar.");
            return;
        }
        System.out.println("Atualizando página: " + paginaAtual);
    }
}
