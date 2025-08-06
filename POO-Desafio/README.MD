```mermaid
classDiagram
    direction LR
    class Iphone

    interface ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    interface AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    interface NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    Iphone ..|> ReprodutorMusical
    Iphone ..|> AparelhoTelefonico
    Iphone ..|> NavegadorInternet
