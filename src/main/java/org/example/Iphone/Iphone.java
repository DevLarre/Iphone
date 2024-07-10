package org.example.Iphone;

import org.example.aparelhoTelefonico.AparelhoTelefonico;
import org.example.email.Email;
import org.example.fotos.Fotos;
import org.example.navegadorInternet.NavegadorInternet;
import org.example.reprodutorMusical.ReprodutorMusical;
import org.example.reprodutorVideo.ReprodutorVideo;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical, Email, Fotos, ReprodutorVideo {

    @Override
    public void ligar() {
        System.out.println("Fazendo chamada do Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Aguardando a outra pessoa atender...");
    }

    @Override
    public void iniciarConversa() {
        System.out.println("Conversa Iniciada...");
    }

    @Override
    public void desligar() {
        System.out.println("Conversa encerrada, deligando a chamada...");
    }
    @Override
    public void enviarEmail() {
        System.out.println(" ");
        System.out.println("Enviando Email do Iphone...");
    }

    @Override
    public void receberEmail() {
        System.out.println("Recebendo resosta do Email...");
    }

    @Override
    public void deletarEmail() {
        System.out.println("Deletando Email...");
    }

    @Override
    public void atualizarEmail() {
        System.out.println("Atualizando Email...");
    }

    @Override
    public void tirarFoto() {
        System.out.println(" ");
        System.out.println("Tirando foto com Iphone");
    }

    @Override
    public void visualizarFoto() {
        System.out.println("Visualizando foto com Iphone");
    }

    @Override
    public void deletarFoto() {
        System.out.println("Deletando foto com Iphone");
    }

    @Override
    public void abrirNavegador() {
        System.out.println(" ");
        System.out.println("Abrindo o Safari no Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba no Safari");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página existente");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando as páginas do Safari");
    }

    @Override
    public void tocarMusica() {
        System.out.println(" ");
        System.out.println("Tocando música no Iphone");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando a música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a música favorita");
    }

    @Override
    public void pararMusica() {
        System.out.println("Parando de tocar música");
    }

    @Override
    public void iniciarVideo() {
        System.out.println(" ");
        System.out.println("Iniciando video no Iphone");
    }

    @Override
    public void pausarVideo() {
        System.out.println("Pausando video");
    }

    @Override
    public void selecionarVideo() {
        System.out.println("Selecionando outro video");
    }

    @Override
    public void pararVideo() {
        System.out.println("Parando video.");
    }
}
