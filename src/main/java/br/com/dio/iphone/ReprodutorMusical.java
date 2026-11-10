package br.com.dio.iphone;

/** Operações de reprodução de música disponíveis no iPhone. */
public interface ReprodutorMusical {
    void tocar();

    void pausar();

    void selecionarMusica(String musica);
}
