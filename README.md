
# 📱 Projeto iPhone - Aprendizado de Polimorfismo e Interfaces
Bem-vindo ao projeto iPhone! Este repositório foi criado como um modelo de estudo para aprender e praticar conceitos de polimorfismo e interfaces em Java. Utilizamos uma simulação de um iPhone para demonstrar esses conceitos de forma prática e intuitiva.

## 📚 Objetivo
O principal objetivo deste projeto é fornecer uma compreensão clara de como usar interfaces e polimorfismo no desenvolvimento de software orientado a objetos.

🔧 Funcionalidades Implementadas
Este projeto simula um iPhone com as seguintes funcionalidades:

🎵 Reprodutor Musical: tocar, pausar, selecionar música.

📞 Aparelho Telefônico: ligar, atender, iniciar correio de voz, iniciar conversa, desligar.

🌐 Navegador na Internet: exibir página, adicionar nova aba, atualizar página.

📧 Email: enviar email, receber email, deletar email.

📸 Fotos: tirar foto, visualizar foto, deletar foto.

🎥 Reprodutor de Vídeo: reproduzir vídeo, pausar vídeo, selecionar vídeo.

## 🛠️ Como Executar o Projeto
### Pré-requisitos
IntelliJ IDEA

Java JDK (versão 11 ou superior)

### Passo a Passo
Clone o repositório:
bash
Copiar código
git clone https://github.com/seu-usuario/projeto-iphone.git

Abra o projeto no IntelliJ IDEA:
Vá em File > Open... e selecione a pasta do projeto.

Compile e execute o projeto:
No IntelliJ, clique com o botão direito no arquivo iPhone.java e selecione Run 'iPhone.main()'.

Exemplo de Uso java,
### Copiar código
public class projectIphone {

    public static void main(String[] args) {
        Iphone phone = new Iphone();

        AparelhoTelefonico aparelhoTelefonico = phone;
        ReprodutorMusical reprodutorMusical = phone;
        NavegadorInternet navegadorInternet = phone;

        aparelhoTelefonico.ligar();
        reprodutorMusical.tocarMusica();
        navegadorInternet.abrirNavegador();
    }
}

## 📑 Estrutura do Projeto
src/: Contém todos os arquivos fonte do projeto.

iPhone.java: Classe principal que implementa todas as interfaces.

AparelhoTelefonico.java: Interface que define os métodos de um aparelho telefônico.

ReprodutorMusical.java: Interface que define os métodos de um reprodutor musical.

NavegadorInternet.java: Interface que define os métodos de um navegador de internet.

Email.java: Interface que define os métodos de um cliente de email.

Fotos.java: Interface que define os métodos de um gerenciador de fotos.

ReprodutorVideo.java: Interface que define os métodos de um reprodutor de vídeo.

## 🚀 Tecnologias Utilizadas
Java: Linguagem de programação utilizada.

IntelliJ IDEA: IDE para desenvolvimento.

### 🤝 Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## 📜Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

## "A única maneira de aprender a programar é programando." - Dennis Ritchie

Espero que este projeto seja útil no seu aprendizado sobre polimorfismo e interfaces em Java! Se tiver alguma dúvida ou sugestão, não hesite em entrar em contato.

### Conecte-se comigo

[![Linkdln](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/douglas-rodrigues-larré-a59637231/)
[![Outlook](https://img.shields.io/badge/Microsoft_Outlook-0078D4?style=for-the-badge&logo=microsoft-outlook&logoColor=white)](dev.larre@outlook.com)
[![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/dev_larre)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/DevLarre)

Vamos codar! 🚀

## © Desenvolvido por Dev Larré, 2024