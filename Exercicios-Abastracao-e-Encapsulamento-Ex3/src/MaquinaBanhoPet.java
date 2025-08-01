public class MaquinaBanhoPet {
    // Atributos
    private int agua = 0;              // Máximo 30 litros
    private int shampoo = 0;           // Máximo 10 litros
    private boolean temPet = false;
    private boolean petLimpo = false;
    private boolean precisaLimpeza = false;

    // Coloca pet na máquina
    public void colocarPet() {
        if (temPet) {
            System.out.println("Já existe um pet na máquina.");
        } else if (precisaLimpeza) {
            System.out.println("A máquina está suja! Limpe antes de colocar outro pet.");
        } else {
            temPet = true;
            petLimpo = false;
            System.out.println("Pet colocado na máquina.");
        }
    }

    // Retira pet da máquina
    public void retirarPet() {
        if (!temPet) {
            System.out.println("Não há pet na máquina.");
            return;
        }

        if (!petLimpo) {
            System.out.println("Pet retirado sem banho! Máquina agora está suja.");
            precisaLimpeza = true;
        } else {
            System.out.println("Pet limpo retirado da máquina.");
        }

        temPet = false;
        petLimpo = false;
    }

    // Dá banho no pet
    public void darBanho() {
        if (!temPet) {
            System.out.println("Nenhum pet na máquina.");
            return;
        }

        if (agua < 10 || shampoo < 2) {
            System.out.println("Água ou shampoo insuficientes. (Necessário: 10L de água e 2L de shampoo)");
            return;
        }

        agua -= 10;
        shampoo -= 2;
        petLimpo = true;
        System.out.println("Banho dado com sucesso!");
    }

    // Abastece água (2 litros por chamada)
    public void abastecerAgua() {
        if (agua >= 30) {
            System.out.println("Tanque de água já está cheio (30L).");
            return;
        }

        agua = Math.min(agua + 2, 30);
        System.out.println("Água abastecida. Nível atual: " + agua + "L");
    }

    // Abastece shampoo (2 litros por chamada)
    public void abastecerShampoo() {
        if (shampoo >= 10) {
            System.out.println("Tanque de shampoo já está cheio (10L).");
            return;
        }

        shampoo = Math.min(shampoo + 2, 10);
        System.out.println("Shampoo abastecido. Nível atual: " + shampoo + "L");
    }

    // Verifica nível de água
    public void verificarNivelAgua() {
        System.out.println("Nível de água: " + agua + "L" + (agua < 10 ? " (BAIXO)" : " (OK)"));
    }

    // Verifica nível de shampoo
    public void verificarNivelShampoo() {
        System.out.println("Nível de shampoo: " + shampoo + "L" + (shampoo < 5 ? " (BAIXO)" : " (OK)"));
    }

    // Limpa a máquina
    public void limparMaquina() {
        if (temPet) {
            System.out.println("Não é possível limpar a máquina com um pet dentro.");
            return;
        }

        if (!precisaLimpeza) {
            System.out.println("A máquina já está limpa.");
            return;
        }

        if (agua < 3 || shampoo < 1) {
            System.out.println("Recursos insuficientes para limpar. (Necessário: 3L de água e 1L de shampoo)");
            return;
        }

        agua -= 3;
        shampoo -= 1;
        precisaLimpeza = false;
        System.out.println("Máquina limpa com sucesso.");
    }

    // Método opcional para debug ou status completo
    public void status() {
        System.out.println("\n===== STATUS DA MÁQUINA =====");
        System.out.println("Água: " + agua + "L /30L");
        System.out.println("Shampoo: " + shampoo + "L /10L");
        System.out.println("Pet na máquina: " + (temPet ? "Sim" : "Não"));
        System.out.println("Pet limpo: " + (petLimpo ? "Sim" : "Não"));
        System.out.println("Precisa de limpeza: " + (precisaLimpeza ? "Sim" : "Não"));
        System.out.println("=================================\n");
    }
}
