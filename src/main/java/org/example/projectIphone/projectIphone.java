package org.example.projectIphone;

import org.example.Iphone.Iphone;
import org.example.aparelhoTelefonico.AparelhoTelefonico;
import org.example.email.Email;
import org.example.fotos.Fotos;
import org.example.navegadorInternet.NavegadorInternet;
import org.example.reprodutorMusical.ReprodutorMusical;
import org.example.reprodutorVideo.ReprodutorVideo;

public class projectIphone {
    public static void main(String[] args) {
        Iphone phone = new Iphone();

        AparelhoTelefonico aparelhoTelefonico = phone;

        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarConversa();
        aparelhoTelefonico.desligar();

        ReprodutorMusical reprodutorMusical = phone;

        reprodutorMusical.tocarMusica();
        reprodutorMusical.pausarMusica();
        reprodutorMusical.selecionarMusica();
        reprodutorMusical.pararMusica();

        NavegadorInternet navegadorInternet = phone;

        navegadorInternet.abrirNavegador();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
        navegadorInternet.fecharPagina();

        Email email = phone;
        email.enviarEmail();
        email.receberEmail();
        email.deletarEmail();
        email.atualizarEmail();

        Fotos fotos = phone;

        fotos.tirarFoto();
        fotos.visualizarFoto();
        fotos.deletarFoto();

        ReprodutorVideo reprodutorVideo = phone;

        reprodutorVideo.iniciarVideo();
        reprodutorVideo.pausarVideo();
        reprodutorVideo.selecionarVideo();
        reprodutorVideo.pararVideo();
    }
}