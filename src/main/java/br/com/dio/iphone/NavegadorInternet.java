package br.com.dio.iphone;

/** Operações de navegação na internet disponíveis no iPhone. */
public interface NavegadorInternet {
    void exibirPagina(String url);

    void adicionarNovaAba();

    void atualizarPagina();
}
