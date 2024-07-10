package org.example.projectIphone;

import org.example.Iphone.Iphone;
import org.example.aparelhoTelefonico.AparelhoTelefonico;
import org.example.email.Email;

public class projectIphone {
    public static void main(String[] args) {
        Iphone phone = new Iphone();

        AparelhoTelefonico aparelhoTelefonico = phone;

        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarConversa();
        aparelhoTelefonico.desligar();

        Email email = phone;
        email.enviarEmail();
        email.receberEmail();
        email.deletarEmail();
        email.atualizarEmail();


    }
}
