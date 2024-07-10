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

    }

    @Override
    public void visualizarFoto() {

    }

    @Override
    public void deletarFoto() {

    }

    @Override
    public void exibirPagina() {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void fecharPagina() {

    }

    @Override
    public void tocarMusica() {

    }

    @Override
    public void pausarMusica() {

    }

    @Override
    public void selecionarMusica() {

    }

    @Override
    public void pararMusica() {

    }

    @Override
    public void reproduceVideo() {

    }

    @Override
    public void pausarVideo() {

    }

    @Override
    public void selecionarVideo() {

    }

    @Override
    public void pararVideo() {

    }
}
