public class Carro {
    private boolean ligado;
    private int velocidade;
    private int marcha;
    private String direcaoAtual = "reto";

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }
    //Metodo para ligar o carro
    public void ligar () {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado!");
        } else {
            System.out.println("Carro já está ligado!");
        }
    }
    //Metodo para desligar o carro
    public void desligar() {
    if (!ligado) {
        System.out.println("Carro já está desligado!");
        return;
    }

    if (velocidade == 0 && marcha == 0) {
        ligado = false;
        System.out.println("Carro desligado com segurança.");
    } else {
        System.out.println("Não é possível desligar. Coloque em ponto morto e pare o carro.");
    }
}
    // Metodo para verificar a velocidade  e a marcha do carro
    public void acelerar() {
    if (!ligado) {
        System.out.println("O carro está desligado. Não é possível acelerar.");
        return;
    }
    if (marcha == 0) {
        System.out.println("O carro está na marcha neutra. Não é possível acelerar.");
        return;
    }
    int novaVelocidade = velocidade + 1;
    if (novaVelocidade > 120) {
        novaVelocidade = 120;
    }
    if (velocidadePermitidaParaMarcha(marcha, novaVelocidade)) {
        velocidade = novaVelocidade;
        System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
    } else {
        System.out.println("Velocidade não permitida para a marcha atual.");
    }
}
    // Metodo para frear o carro
    public void frear(int decremento) {
        if (!ligado) {
            System.out.println("O carro está desligado. Não é possível frear.");
            return;
        }
        velocidade -= decremento;
        if (velocidade < 0) {
            velocidade = 0;
        }
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
    // Metodo para trocar a marcha do carro
    public void mudarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("O carro está desligado. Não é possível mudar de marcha.");
            return;
        }
        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida. Deve ser entre 0 e 6.");
            return;
        }
        if (Math.abs(novaMarcha - marcha) != 1) {
            System.out.println("Você só pode mudar para a marcha imediatamente superior ou inferior.");
            return;
        }
        marcha = novaMarcha;
        System.out.println("Marcha alterada para: " + marcha);
    }

    //Metodo para virar o carro
    public void virar(String lado) {
    if (!ligado) {
        System.out.println("Carro desligado. Não é possível virar.");
        return;
    }

    if (velocidade < 1 || velocidade > 40) {
        System.out.println("Só é possível virar entre 1 km/h e 40 km/h.");
        return;
    }

    if (!lado.equalsIgnoreCase("esquerda") && !lado.equalsIgnoreCase("direita")) {
        System.out.println("Direção inválida. Use 'esquerda' ou 'direita'.");
        return;
    }

    direcaoAtual = lado.toLowerCase();
    System.out.println("Virando para a " + direcaoAtual + ".");
    
    // Retomando direção reto após virar
    direcaoAtual = "reto";
    System.out.println("Direção retomada: reto.");
}

// Setters e Getters
    public boolean isLigado() {
        return ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getMarcha() {
        return marcha;
    }
    public String getDirecaoAtual() {
        return direcaoAtual;
    }

    private boolean velocidadePermitidaParaMarcha(int marcha, int velocidade) {
    switch (marcha) {
        case 0: return velocidade == 0;
        case 1: return velocidade >= 0 && velocidade <= 20;
        case 2: return velocidade >= 21 && velocidade <= 40;
        case 3: return velocidade >= 41 && velocidade <= 60;
        case 4: return velocidade >= 61 && velocidade <= 80;
        case 5: return velocidade >= 81 && velocidade <= 100;
        case 6: return velocidade >= 101 && velocidade <= 120;
        default: return false;
    }
}
}
