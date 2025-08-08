import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Itens> itens;

    public CarrinhoDeCompras () {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Itens item = new Itens(nome, preco, quantidade);
        this.itens.add(item);
    }

    public void removerItem(String nome) {
        this.itens.removeIf(item -> item.getNome().equals(nome));
    }

    public void calcularValorTotal() {
        double total = 0.0;
        for (Itens item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        System.out.println("Valor total do carrinho: " + total);
    }

    public void exibirItens() {
        for (Itens item : itens) {
            System.out.println("Nome: " + item.getNome() + ", Preço: " + item.getPreco() + ", Quantidade: " + item.getQuantidade());
        }
    }
}
